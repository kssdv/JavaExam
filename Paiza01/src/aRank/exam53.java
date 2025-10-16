package aRank;

import java.util.Scanner;

public class exam53 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		String[] lst = new String[n];
		
		for(int i=0; i<n; i++) {
			lst[i] = sc.next();
		}
		
		int num = m % n;
		System.out.println(lst[num-1]);
	}

}
