package myproject01;

import java.util.Scanner;

public class exam46 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = str2int(sc.nextLine().split(" "));
		for(int i=0; i<num[0]; i++) {
			int t = Integer.parseInt(sc.nextLine());
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
