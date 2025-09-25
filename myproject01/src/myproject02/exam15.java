package myproject02;

import java.util.Scanner;

public class exam15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		if("c".contains("container")) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
		
		if("container".contains("c")) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
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
