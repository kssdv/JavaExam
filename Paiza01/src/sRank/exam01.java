package sRank;

import java.util.Scanner;

public class exam01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		int[] numbers = str2int(sc.nextLine().split(" "));
		int res = 0;
		for(int i : numbers) {
			res = res ^ i;
		}
		System.out.println(res);
	}
	static private int[] str2int(String[] str){
		int[] lst = new int[str.length];
		for(int i=0; i<str.length; i++) {
			lst[i] = Integer.parseInt(str[i]);
		}
		
		return lst;
	}
}
