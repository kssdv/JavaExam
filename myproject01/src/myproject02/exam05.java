package myproject02;

public class exam05 {
	public static void main(String[] args) {
		int cnt = 0;
		for(int i=0; i<24; i++) {
			for(int j=0; j<60; j++) {
				int t = i+j;
				if(t == 0 || (t % 3 == 0 && t % 5 == 0)) {
					System.out.print("FIZZBUZZ");
				}else if(t % 5 == 0) {
					System.out.print("BUZZ");
				}else if(t % 3 == 0) {
					System.out.print("FIZZ");
				}
				System.out.println();
			}
		}
	}
	
	public static int[] str2int(String[] slst) {
		int[] lst = new int[slst.length];
		for(int i=0; i<slst.length; i++) {
			lst[i] = Integer.parseInt(slst[i]);
		}
		
		return lst;
	}
}
