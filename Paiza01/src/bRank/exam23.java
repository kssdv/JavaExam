package bRank;

import java.util.Scanner;

public class exam23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());
		int[] lst = new int[num];
		lst[0] = 1;
		lst[1] = 1;
		
		if(num <= 2) {
			System.out.println(1);
		}else {
			for(int i=2; i<num; i++) {
				lst[i] = lst[i-2] + lst[i-1];
			}
			System.out.println(lst[num-1]);
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
