package assgn1;

import java.util.Random;

public class Q5 {

	public static void main(String[] args) {
		BinarySearchTree<Integer> t1 = new BinarySearchTree<>( );
		AVLTree<Integer> t2 = new AVLTree<>( );
		RedBlackBST<Integer, Integer> t3 = new RedBlackBST<Integer, Integer>();
		SplayTree<Integer> t4 = new SplayTree<Integer>( );
		
		Random r = new Random();//To create Random Integers
		 
		 
		long startTime1, startTime2, startTime3, startTime4;
		long sum1=0, sum2=0, sum3=0, sum4 = 0;
		
		/*Loop for Insertion*/
		System.out.println("Average Time taken for each Insertion:");
		for (int i = 1; i<=100000; i++) {
			int n = r.nextInt(1, 100000);//creating random integers
			startTime1 = System.nanoTime();
			t1.insert(n);
			sum1 = sum1 + (System.nanoTime() - startTime1);
			
			startTime2 = System.nanoTime();
			t2.insert(n);
			sum2 = sum2 + (System.nanoTime() - startTime2);
			
			startTime3 = System.nanoTime();
			t3.put(i,n);
			sum3 = sum3 + (System.nanoTime() - startTime3);
			
			startTime4 = System.nanoTime();
			t4.insert(n);
			sum4 = sum4 + (System.nanoTime() - startTime4);
		}
		System.out.println("BinarySearchTree  = "+(double)sum1/100000 + " nanoseconds");
		System.out.println("AVLTree  = "+(double)sum2/100000 + " nanoseconds");
		System.out.println("RedBlackBST  = "+(double)sum3/100000 + " nanoseconds");
		System.out.println("SplayTree  = "+(double)sum4/100000 + " nanoseconds");
		System.out.println();
		
		/*Loop for Searching*/
		System.out.println("Average Time taken for each Search:");
		for (int i = 1; i<=100000; i++) {
			startTime1 = System.nanoTime();
			int n = r.nextInt(1, 100000);
			t1.contains(n);
			sum1 = sum1 + (System.nanoTime() - startTime1);
			
			startTime2 = System.nanoTime();
			t2.contains(n);
			sum2 = sum2 + (System.nanoTime() - startTime2);
			
			startTime3 = System.nanoTime();
			t3.get(n);
			sum3 = sum3 + (System.nanoTime() - startTime3);
			
			startTime4 = System.nanoTime();
			t4.contains(n);
			sum4 = sum4 + (System.nanoTime() - startTime4);
		}
		System.out.println("BinarySearchTree  = "+(double)sum1/100000 + " nanoseconds");
		System.out.println("AVLTree  = "+(double)sum2/100000 + " nanoseconds");
		System.out.println("RedBlackBST  = "+(double)sum3/100000 + " nanoseconds");
		System.out.println("SplayTree  = "+(double)sum4/100000 + " nanoseconds");
		System.out.println();
		
		/*Loop for removal*/
		System.out.println("Average Time Taken for each Removal");
		for (int i = 100000; i>=1; i--) {
			try {
				int n = r.nextInt(1, 100000);
				startTime1 = System.nanoTime();
				t1.remove(n);
				sum1 = sum1 + (System.nanoTime() - startTime1);

				startTime2 = System.nanoTime();
				t2.remove(n);
				sum2 = sum2 + (System.nanoTime() - startTime2);

				startTime3 = System.nanoTime();
				t3.delete(n);
				sum3 = sum3 + (System.nanoTime() - startTime3);

				startTime4 = System.nanoTime();
				t4.remove(n);
				sum4 = sum4 + (System.nanoTime() - startTime4);
			}
			catch(Exception e) {}
		}
		System.out.println("BinarySearchTree  = "+(double)sum1/100000 + " nanoseconds");
		System.out.println("AVLTree  = "+(double)sum2/100000 + " nanoseconds");
		System.out.println("RedBlackBST  = "+(double)sum3/100000 + " nanoseconds");
		System.out.println("SplayTree  = "+(double)sum4/100000 + " nanoseconds");

	}

}
