package myproject01;

import java.util.Scanner;

public class exam44 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = str2int(sc.nextLine().split(" "));
		int idx = -1;
		
		for(int i=0; i<num[0]; i++) {
			int t = Integer.parseInt(sc.nextLine());
			if(num[1] == t && idx == -1) {
				idx = i+1;
			}
		}
		System.out.println(idx);
	}
	public static int[] str2int(String[] str) {
		int[] lst = new int[str.length];
		for(int i=0; i<str.length; i++) {
			lst[i] = Integer.parseInt(str[i]);
		}
		return lst;
	}
}
