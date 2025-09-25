package bRank;

import java.util.Scanner;

public class exam32 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long x = Long.parseLong(sc.nextLine());
		long[] f = str2long(sc.nextLine().split(" "));
		long f1 = f[0];
		long f2 = f[1];
		long[] ln = str2long(sc.nextLine().split(" "));
		long l = ln[0];
		long n = ln[1];
		long[] s = str2long(sc.nextLine().split(" "));
		long res = 0;
		
//		0, s1, s2, ..., sN, L
		if(n == 0) {
			res = 0;
		}else { // nが1以上の通常の場合
			res += usedFuel(x, f1, f2, 0, s[0]);
			for(int i=1; i<s.length; i++) {
				res += usedFuel(x, f1, f2, s[i-1], s[i]);
			}
			res += usedFuel(x, f1, f2, s[s.length-1], l);
		}
		System.out.println(res);
	}
	public static long usedFuel(long x, long f1, long f2, long l1, long l2) {
		long distance = l2 - l1;
		if(distance == 0) {
			return 0;
		}else if(distance <= x) {
			return distance * f1;
		}else if(distance > x) {
			return x * f1 + (distance - x) * f2;
		}
		return -1;
	}
	
	public static long[] str2long(String[] str) {
		long[] lst = new long[str.length];
		for(long i=0; i<str.length; i++) {
			lst[(int) i] = Long.parseLong(str[(int) i]);
		}
		return lst;
	}
}
