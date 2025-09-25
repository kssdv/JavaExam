package myproject01;

import java.util.Scanner;

public class exam53 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = str2int(sc.nextLine().split(" "));
		for(int i=0; i<num[1]; i++) {
			if(i >= num[0]) {
				System.out.println("0");
			}else {
				System.out.println(sc.nextLine());
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
