package bRank;

import java.util.Scanner;
// 絶対longタイプで1,000,000,000を超える数値もある
// int x, int y, long sum
// int MAX_VALUE: 2,147,483,647

public class exam35 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		long[][] tyx = new long [n][3];
		long[] tmp = str2long(sc.nextLine().split(" "));
		tyx[0][0] = 0;
		tyx[0][2] = tmp[1];
		tyx[0][1] = tmp[2];
		long slantx = 0;
		long slanty = 0;
		long resx = tyx[0][2];
		long resy = tyx[0][1];
		
//		System.out.println(tyx[0][2] + " "+ tyx[0][1]);
		for(int i=1; i<n; i++) {
			tyx[i] = str2long(sc.nextLine().split(" "));
//			long x = tyx[i][2] - tyx[i-1][2];
			long x = minusAB(tyx[i][2], tyx[i-1][2]);
//			long y = tyx[i][1] - tyx[i-1][1];
			long y = minusAB(tyx[i][1], tyx[i-1][1]);
			long t = tyx[i][0] - tyx[i-1][0];
			slantx = x / t;
			slanty = y / t;
			// ex. 0, 50 -> 0, 1, 2, ... 49
			for(int j=(int) tyx[i-1][0]; j<tyx[i][0]; j++) {
				System.out.println(resy +" " + resx);
				resx += slantx;
				resy += slanty;
			}
			resy = tyx[i][2];
			resy = tyx[i][1];
//			System.out.println(resy +" " + resx);
		}
		System.out.println(resy +" " + resx);
	}
	
	public static long minusAB(long a, long b) {
		if(a >= b) {
			return a-b;
		}else {
			return b-a;
		}
	}
	
	public static long manualAbs(long n) {
		if(n >= 0) {
			return n;
		}else {
			return -n;
		}
	}
	
	public static long[] str2long(String[] str) {
		long[] lst = new long[str.length];
		for(long i=0; i<str.length; i++) {
			lst[(int) i] = Long.parseLong(str[(int) i]);
		}
		return lst;
	}
	
	public static int[] str2int(String[] str) {
		int[] lst = new int[str.length];
		for(int i=0; i<str.length; i++) {
			lst[i] = Integer.parseInt(str[i]);
		}
		return lst;
	}
}
