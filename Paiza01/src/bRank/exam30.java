package bRank;

import java.util.Scanner;

public class exam30 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextInt();
		long x = sc.nextInt();
		long k = sc.nextInt();
		long h = 4 * n - k;
//		int[] lst = new int[k];
		
		long res = 0;
		int flag = 2;
		for(long i=0; i<k; i++) {
			flag++;
//			if(i > n * 4) {
//				if(flag > 2) {
//					 flag -= 4;
//				}else if(flag > 0) {
//					lst[i] = x;
//					res += x;
//				}
//			}
			if(flag > 2) {
				 flag -= 4;
			}else if(flag > 0) {
				if(i > n * 4) {
//					lst[i] = x;
					res += x;
				}
			}
		}
//		System.out.println("総回数：" + k + ", いたずらを始めた直前の回数：" + 4 * n + ", 伸びたcm："+x);
		System.out.println(res);
//		for(int i=0; i<lst.length; i++) {
//			System.out.println((i+1)+"回：" + lst[i]);
//		}
	}
}
