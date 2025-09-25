package aRank;

import java.util.Scanner;

public class exam07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		int[] lst = str2int(sc.nextLine().split(" "));
		int sum = 0;
		int t = 0;
		
		for(int i : lst) {
			sum += i;
			t = i;
		}
		sum -= t;
		System.out.println(sum);
	}
	static int[] str2int(String[] str) {
		int[] lst = new int[str.length];
		for(int i=0; i<str.length; i++) {
			lst[i] = Integer.parseInt(str[i]);
		}
		
		return lst;
	}
}
