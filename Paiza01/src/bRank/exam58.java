package bRank;

import java.util.Scanner;

public class exam58 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		int[][] lst = new int[n*n][n];
		int max = 0;
		int h = n*n;
		int w = n;
		
		for(int i=0; i<h; i++) {
			lst[i] = str2int(sc.nextLine().split(" "));
		}
		
//		printArray(lst);
		
//		System.out.println("yoko max : "+yoko(lst));
//		System.out.println("tate max : "+tate(lst));
//		System.out.println("naname max : "+naname(lst));
		if(n == 1) {
			System.out.println(lst[0][0]);
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
	
	private static int naname(int[][] lst) {
		int n = lst[0].length;
		int max = 0;
		
		// [0,0], [1,1], ...
		for(int i=0; i<=n*n-n; i++) {
			int sum = 0;
			for(int j=0; j<n; j++) {
				sum += lst[j+i][j];
//				System.out.printf("[%d, %d]", j+i, j);
			}
//			System.out.println();
			if(max < sum) {
				max = sum;
			}
		}
		// [3,0], [2,1], [1,2], [0,3]
		for(int i=0; i<=n*n-n; i++) {
			int sum = 0;
			for(int j=0; j<n; j++) {
				sum += lst[j+i][n-j-1];
//				System.out.printf("[%d, %d]", j+i, n-j-1);
			}
//			System.out.println();
			if(max < sum) {
				max = sum;
			}
		}
		
		return max;
	}
	
	private static int yoko(int[][] lst) {
		int max = 0;
		for(int i=0; i<lst.length; i++) {
			int sum = 0;
			for(int j=0; j<lst[0].length; j++) {
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
		int n = lst[0].length;
		
		// (0, (n-1)), (1, (n-1)+1), ... 
		for(int i=0; i<lst[0].length; i++) {
			for(int j=0; j<=n*n-n; j++) {
				int sum = 0;
				for(int l=j; l<j+n; l++) {
					sum += lst[l][i];
//					System.out.printf("[%d, %d]", l, i);
				}
//				System.out.println();
				if(max < sum) {
					max = sum;
				}
			}
		}
		return max;
	}
	
	private static void printArray(int[][] lst) {
		for(int[] l : lst) {
			for(int j : l) {
				System.out.printf(" %d", j);
			}
			System.out.println();
		}
	}
	
	private static int[] str2int(String[] slst) {
		int[] lst = new int[slst.length];
		for(int i=0; i<slst.length; i++) {
			lst[i] = Integer.parseInt(slst[i]);
		}
		
		return lst;
	}
}
