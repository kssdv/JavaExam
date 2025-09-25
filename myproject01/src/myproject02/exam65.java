package myproject02;

import java.util.Scanner;

public class exam65 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		
		if(n >= 0 && n <2) {
			System.out.println("clear");
		}else if(n >= 2 && n < 9) {
			System.out.println("sunny");
		}else if(n >= 9 && n <= 10) {
			System.out.println("cloudy");
		}
		
	}
	public static int[] str2int(String[] s) {
		int[] lst = new int[s.length];
		for(int i=0; i<s.length; i++) {
			lst[i] = Integer.parseInt(s[i]);
		}
		return lst;
	}
}
