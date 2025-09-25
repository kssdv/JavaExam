package bRank;

import java.util.Scanner;

public class exam57 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		int[][] lst = new int[n][n];
		int max = 0;
		
		for(int i=0; i<n; i++) {
			lst[i] = str2int(sc.nextLine().split(" "));
		}
		
//		for(int[] l : lst) {
//			for(int j : l) {
//				System.out.printf(" %d", j);
//			}
//			System.out.println();
//		}
		if(n == 1) {
			System.out.println(n);
		}else {
//			System.out.println("縦: "+tate(lst));
//			System.out.println("横: "+yoko(lst));
//			System.out.println("斜め: "+naname(lst));
			max = tate(lst);
			int tmp = yoko(lst);
			if(max < tmp) max = tmp;
			tmp = naname(lst);
			if(max < tmp) max = tmp;
			System.out.println(max);
		}
	}
	
	private static int[] str2int(String[] slst) {
		int[] lst = new int[slst.length];
		for(int i=0; i<slst.length; i++) {
			lst[i] = Integer.parseInt(slst[i]);
		}
		
		return lst;
	}
	
	private static int naname(int[][] lst) {
		int max = 0;
		int sum1 = 0;
		int sum2 = 0;
		
		for(int i=0; i<lst.length; i++) {
			sum1 += lst[i][i];
		}
		for(int i=0; i<lst.length; i++) {
			sum2 += lst[lst.length-i-1][i];
		}
		
		return sum1 > sum2 ? sum1 : sum2;
	}
	
	private static int yoko(int[][] lst) {
		int max = 0;
		for(int i=0; i<lst[0].length; i++) {
			int sum = 0;
			for(int j=0; j<lst.length; j++) {
				sum += lst[i][j];
			}
			if(max < sum) {
				max = sum;
			}
		}
		return max;
	}
	
	private static int tate(int[][] lst) {
		int max = 0;
		for(int i=0; i<lst[0].length; i++) {
			int sum = 0;
			for(int j=0; j<lst.length; j++) {
				sum += lst[j][i];
			}
			if(max < sum) {
				max = sum;
			}
		}
		return max;
	}
}
