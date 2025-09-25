package myproject02;

import java.util.Scanner;

public class exam03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());
		int[] lst = str2int(sc.nextLine().split(" "));
		
		for(int i=0; i<num; i++) {
			for(int j=0; j<num; j++) {
				int t = lst[i] * lst[j];
				System.out.print(j == 0 ? t : " "+t);
			}
			System.out.println();
		}
	}
	
	public static int[] str2int(String[] slst) {
		int[] lst = new int[slst.length];
		for(int i=0; i<slst.length; i++) {
			lst[i] = Integer.parseInt(slst[i]);
		}
		
		return lst;
	}
}
