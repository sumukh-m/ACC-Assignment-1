package assgn1;
import java.util.Random;

public class Q4 {
	
	public static void main (String args[]) {
		BinarySearchTree<Integer> t1 = new BinarySearchTree<>( );
		AVLTree<Integer> t2 = new AVLTree<>( );
		RedBlackBST<Integer, Integer> t3 = new RedBlackBST<Integer, Integer>();
		SplayTree<Integer> t4 = new SplayTree<Integer>( );
		
		Random r = new Random();//Created for Random Integers
		 
		 
		long startTime1, startTime2, startTime3, startTime4;
		long sum1=0, sum2=0, sum3=0, sum4 = 0;
		
		/*Loop for insertion*/
		System.out.println("Average Time for Each Insertion:");
		for (int i = 1; i<=100000; i++) {
			startTime1 = System.nanoTime();
			t1.insert(i);
			sum1 = sum1 + (System.nanoTime() - startTime1);
			
			startTime2 = System.nanoTime();
			t2.insert(i);
			sum2 = sum2 + (System.nanoTime() - startTime2);
			
			startTime3 = System.nanoTime();
			t3.put(i,i);
			sum3 = sum3 + (System.nanoTime() - startTime3);
			
			startTime4 = System.nanoTime();
			t4.insert(i);
			sum4 = sum4 + (System.nanoTime() - startTime4);
		}
		System.out.println("BinarySearchTree  = "+(double)sum1/100000 + " nanoseconds");
		System.out.println("AVLTree  = "+(double)sum2/100000 + " nanoseconds");
		System.out.println("RedBlackBST  = "+(double)sum3/100000 + " nanoseconds");
		System.out.println("SplayTree  = "+(double)sum4/100000 + " nanoseconds");
		System.out.println();
		
		/*Loop for Searching*/
		System.out.println("Average Time for Each Search:");
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
		
		/*Loop for Removal*/
		System.out.println("Average Time for Each Removal:");
		for (int i = 100000; i>=1; i--) {
			startTime1 = System.nanoTime();
			t1.remove(i);
			sum1 = sum1 + (System.nanoTime() - startTime1);
			
			startTime2 = System.nanoTime();
			t2.remove(i);
			sum2 = sum2 + (System.nanoTime() - startTime2);
			
			startTime3 = System.nanoTime();
			t3.delete(i);
			sum3 = sum3 + (System.nanoTime() - startTime3);
			
			startTime4 = System.nanoTime();
			t4.remove(i);
			sum4 = sum4 + (System.nanoTime() - startTime4);
		}
		System.out.println("BinarySearchTree  = "+(double)sum1/100000 + " nanoseconds");
		System.out.println("AVLTree  = "+(double)sum2/100000 + " nanoseconds");
		System.out.println("RedBlackBST  = "+(double)sum3/100000 + " nanoseconds");
		System.out.println("SplayTree  = "+(double)sum4/100000 + " nanoseconds");
	}
}
