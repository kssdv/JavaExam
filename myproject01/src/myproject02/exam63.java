package myproject02;

import java.util.Scanner;

public class exam63 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] n = str2int(sc.nextLine().split(" "));
		int sum = 0;
		
		for(int i=0; i<n[0]; i++) {
			sum += Integer.parseInt(sc.nextLine());
		}
		
		System.out.println(n[1] >= sum ? "OK" : "NG");
	}
	public static int[] str2int(String[] s) {
		int[] lst = new int[s.length];
		for(int i=0; i<s.length; i++) {
			lst[i] = Integer.parseInt(s[i]);
		}
		return lst;
	}
}
