package myproject01;

import java.util.Scanner;

public class exam72 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] lst = str2int(sc.nextLine().split(" "));
		int m = 0;
		
		while(lst[0] < lst[1]) {
			lst[0] = lst[0] * 2;
			m++;
		}
		System.out.println(m);
	}
	
	public static int[] str2int(String[] str) {
		int[] lst = new int[str.length];
		for(int i=0; i<str.length; i++) {
			lst[i] = Integer.parseInt(str[i]);
		}
		return lst;
	}
}
