package myproject01;

import java.util.Scanner;

public class exam39 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine().split(" ")[1]);
		int[] lst = str2int(sc.nextLine().split(" "));
		
		for(int i=0; i<lst.length; i++) {
			if(lst[i] >= num) {
				System.out.println(lst[i]);
			}
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
