package aRank;

public class exam10 {

	public static void main(String[] args) {
		int decimal = 1;
		for(int i=2; i<=5; i++) {
//			String binary = Integer.toBinaryString(decimal);
			System.out.println(decimal ^ i);
			decimal = i;
			
		}
		System.out.println("==================");
		int x = 5; // Binary: 101
        int y = 3; // Binary: 011
        System.out.println("x ^ y = " + (x ^ y)); // Output: 6
		
	}

}
