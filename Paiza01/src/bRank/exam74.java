package bRank;

import java.util.Scanner;

public class exam74 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = str2int(sc.nextLine().split(" "));
		int n = num[0];
		int m = num[1] - 1;
		int mok = m / (n * 2);
		int na = m % (n * 2);
		int res = na;
		
		// 裏の数字
		if(na < n) {
			res = n * 2 - 1 - res;
		}else {
			res = n * 2 - 1 - res;
		}
		
		res = res + mok * n * 2;
		
		System.out.println(res+1);
	}
	
	static int[] str2int(String[] str) {
		int[] lst = new int[str.length];
		for(int i=0; i<str.length; i++) {
			lst[i] = Integer.parseInt(str[i]);
		}
		return lst;
	}
}
