package bRank;

import java.util.Scanner;

public class exam34 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(manualAbs((long) -10));
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
}
