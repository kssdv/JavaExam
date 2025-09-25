package myproject01;

import java.util.Scanner;

public class exam99 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		
		for(int i=0; i<n; i++) {
			int[] t = str2int(sc.nextLine().split(" "));
			int sum = 0;
			for(int j=1; j<t.length; j++) {
				sum += t[j];
			}
			System.out.println(sum);
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
