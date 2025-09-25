package myproject01;

import java.util.Scanner;

public class exam41 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(Math.abs(6 - 2) + Math.abs(6 - 1));
	}
	
	public static int[] str2int(String[] str) {
		int[] lst = new int[str.length];
		for(int i=0; i<str.length; i++) {
			lst[i] = Integer.parseInt(str[i]);
		}
		return lst;
	}
}
