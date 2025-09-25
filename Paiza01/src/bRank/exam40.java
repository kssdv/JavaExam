package bRank;

import java.util.Scanner;

public class exam40 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] sushies = new int[n];
		int max  = 0;
		
		for(int i=0; i<n; i++) {
			int p = sc.nextInt();
			sushies[i] = p;
		}
		
		for(int i=0; i<sushies.length; i++) {
			int tmp = sumCost(sushies, i, k);
			if(max < tmp) {
				max = tmp;
			}
		}
		System.out.println(max);
	}
	
	public static int sumCost(int[] lst, int idx, int k) {
		int sum = 0;
		
		for(int i=idx; i<idx+k; i++) {
			if(i >= lst.length) {
				sum += lst[i - (lst.length)];
			}else {
				sum += lst[i];
			}
		}
		return sum;
	}
}
