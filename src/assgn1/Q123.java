package assgn1;

public class Q123 {
	
	static CuckooHashTable<String> H1 = new CuckooHashTable<>( new StringHashFamily( 3 ), 2000);
	static QuadraticProbingHashTable<String> H2 = new QuadraticProbingHashTable<>( );
	static SeparateChainingHashTable<String> H3= new SeparateChainingHashTable<>( );
	
	/* Insert Random Strings based on the HashTable */
	public void insertTenRandomStrings(int n, CuckooHashTable<String> HT1, QuadraticProbingHashTable<String>HT2, SeparateChainingHashTable<String> HT3) {
		if(HT1 != null) {
			for(int i = 1; i<=n; i++) {
				String r = RandomStringGenerator(10); //Generates Random Strings
				HT1.insert(r);
			}
		}
		else if(HT2 != null) {
			for(int i = 1; i<=n; i++) {
				String r = RandomStringGenerator(10);
				HT2.insert(r);
			}

		}
		else {
			for(int i = 1; i<=n; i++) {
				String r = RandomStringGenerator(10);
				HT3.insert(r);
			}

		}
		
	}
	
	/* Find Random Strings based on the HashTable*/
	public void findRandomStrings(int n, CuckooHashTable<String> HT1, QuadraticProbingHashTable<String>HT2, SeparateChainingHashTable<String> HT3) {
		if(HT1 != null) {
			for(int i = 1; i<=n; i++) {
				String r = RandomStringGenerator(10);
				if(HT1.contains(r))
					HT1.remove(r);
			}
		}
		if(HT2 != null) {
			for(int i = 1; i<=n; i++) {
				String r = RandomStringGenerator(10);
				if(HT2.contains(r))
					HT2.remove(r);
			}
		}
		if(HT3!=null) {
			for(int i = 1; i<=n; i++) {
				String r = RandomStringGenerator(10);
				if(HT3.contains(r))
					HT3.remove(r);
			}
		}
		
	}
	
	/* Method to generate Random Strings*/
	private String RandomStringGenerator(int l) {
		String Characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		StringBuilder s = new StringBuilder(l);
		
		for(int i = 0; i<1; i++) {
			int ch = (int)(Characters.length() * Math.random());//Generate Random Character
			s.append(Characters.charAt(ch));
		}
		return s.toString();
	}
	
	public static void main(String args[]) {
		Q123 q = new Q123();
		long startTime;
		double sum1=0, sum2=0;
		
		System.out.println("Average Time taken for 2^i where i = 1 to 20:");
		System.out.println();
		
		System.out.println("Average Time by Cuckoo Hash Table: ");
		for(int i = 1; i<=20; i++) {
			startTime = System.nanoTime();
			q.insertTenRandomStrings((int)Math.pow(2, i), H1, null, null );
			sum1 = sum1 + (System.nanoTime()-startTime);
			startTime = System.nanoTime();
			q.findRandomStrings((int)Math.pow(2, i), H1, null, null);
			sum2 = sum2 + (System.nanoTime() - startTime);
		}
		System.out.println("Insertion: " + (double)sum1/20);
		System.out.println("Searching: "+ (double)sum2/20);
		System.out.println();
		
		System.out.println("Average Time by QuadraticProbing Hash Table: ");
		for(int i = 1; i<=20; i++) {
			startTime = System.nanoTime();
			q.insertTenRandomStrings((int)Math.pow(2, i), null, H2, null);
			sum1 = sum1 + (System.nanoTime() - startTime);
			startTime = System.nanoTime();
			q.findRandomStrings((int)Math.pow(2, i), null, H2, null);
			sum2 = sum2 + (System.nanoTime() - startTime);
		}
		System.out.println("Insertion: " + (double)sum1/20);
		System.out.println("Searching: "+ (double)sum2/20);
		System.out.println();
		
		System.out.println("Average Time by SeparateChaining Hash Table: ");
		for(int i = 1; i<=20; i++) {
			startTime = System.nanoTime();
			q.insertTenRandomStrings((int)Math.pow(2, i), null, null, H3);
			sum1 = sum1 + (System.nanoTime() - startTime);
			startTime = System.nanoTime();
			q.findRandomStrings((int)Math.pow(2, i), null, null, H3);
			sum2 = sum2 + (System.nanoTime() - startTime);
		}
		System.out.println("Insertion: " + (double)sum1/20);
		System.out.println("Searching: "+ (double)sum2/20);
		System.out.println();
		
		
	}
}
