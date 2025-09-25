package myproject02;

import java.util.Scanner;

public class exam04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());
		int sum = 1;
		int cnt = 0;
		for(int i=1; i<=num; i++) {
			sum *= i;
			while(sum % 2 == 0) {
				sum /= 2;
				cnt++;
			}
		}
		
		System.out.println(cnt);
	}
	
	public static int[] str2int(String[] slst) {
		int[] lst = new int[slst.length];
		for(int i=0; i<slst.length; i++) {
			lst[i] = Integer.parseInt(slst[i]);
		}
		
		return lst;
	}
}
