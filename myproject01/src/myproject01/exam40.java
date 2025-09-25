package myproject01;

import java.util.Scanner;

public class exam40 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] lstr = sc.nextLine().split(" ");
		int[] num = str2int(lstr);
		int[] zahyo1 = new int[2];
		int[] zahyo2 = new int[2];
		
		for(int i=0; i<num[0]; i++) {
			String s = sc.nextLine();
			int t1 = Integer.parseInt(s.split(" ")[0]);
			int t2 = Integer.parseInt(s.split(" ")[1]);
			if(num[1]-1 == i) {
				zahyo1[0] = t1;
				zahyo1[1] = t2;
			}else if(num[2]-1 == i) {
				zahyo2[0] = t1;
				zahyo2[1] = t2;
			}
		}
		System.out.println(Math.abs(zahyo1[0] - zahyo2[0]) + Math.abs(zahyo1[1] - zahyo2[1]));
	}
	
	public static int[] str2int(String[] str) {
		int[] lst = new int[str.length];
		for(int i=0; i<str.length; i++) {
			lst[i] = Integer.parseInt(str[i]);
		}
		
		return lst;
	}
	
	public static void printAll(String[] lst) {
		for(int i=0; i<lst.length; i++) {
			System.out.println(lst[i]);
		}
	}
	
	public static void printAll(int[] lst) {
		for(int i=0; i<lst.length; i++) {
			System.out.println(lst[i]);
		}
	}
}
