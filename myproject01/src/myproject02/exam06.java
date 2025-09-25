package myproject02;

public class exam06 {
	public static void main(String[] args) {
		int max = 0;
		for(int x=0; x<100; x++) {
			for(int y=0; y<100; y++) {
				if(x + y < 100 && x*x*x + y*y*y < 100000) {
					if(max < x*y) {
						max = x*y;
					}
				}
			}
		}
		System.out.println(max);
	}
	
	public static int[] str2int(String[] slst) {
		int[] lst = new int[slst.length];
		for(int i=0; i<slst.length; i++) {
			lst[i] = Integer.parseInt(slst[i]);
		}
		
		return lst;
	}
}
