package myproject01;

import java.util.Scanner;

public class exam100 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				if(j == 1) {
					System.out.printf("%d",j);
				}else {
					System.out.printf(" %d",j);
				}
			}
			System.out.println();
		}
	}
	
	public static int[] str2int(String[] str) {
		int[] lst = new int[str.length];
		for(int i=0; i<str.length; i++) {
			lst[i] = Integer.parseInt(str[i]);
		}
		return lst;
	}
}
