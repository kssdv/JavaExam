package myproject02;

import java.util.Scanner;

public class exam07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());
		boolean flag = false;
		
		for(int i=1; i<num-2; i++) {
			for(int j=1; j<num-2; j++) {
				for(int l=1; l<num-2; l++) {
					if(i*i == j*j+ l*l && num == i+j+l) {
						flag = true;
					}
				}
			}
		}
		System.out.println(flag ? "YES" : "NO");
		
	}
	
	public static int[] str2int(String[] slst) {
		int[] lst = new int[slst.length];
		for(int i=0; i<slst.length; i++) {
			lst[i] = Integer.parseInt(slst[i]);
		}
		
		return lst;
	}
}
