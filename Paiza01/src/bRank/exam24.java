package bRank;

import java.util.Scanner;

public class exam24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());
		for(int i=0; i<num; i++) {
			int t = Integer.parseInt(sc.nextLine());
			System.out.println(fibonacci(t));
		}
	}
	public static int fibonacci(int num) {
		if(num <= 2) {
			return 1;
		}else {
			int[] lst = new int[num];
			lst[0] = 1;
			lst[1] = 1;
			
			for(int i=2; i<num; i++) {
				lst[i] = lst[i-2] + lst[i-1];
			}
			return lst[num-1];
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
