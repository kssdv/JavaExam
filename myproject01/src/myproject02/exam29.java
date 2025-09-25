package myproject02;

import java.util.Scanner;

public class exam29 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] lst = str2int(sc.nextLine().split(" "));
		System.out.println(
				(lst[0] == lst[1] || lst[2] == lst[3])
				&& lst[0] == lst[2]
				? "1" : "0");
	}
	
	public static int[] str2int(String[] s) {
		int[] lst = new int[s.length];
		for(int i=0; i<s.length; i++) {
			lst[i] = Integer.parseInt(s[i]);
		}
		return lst;
	}
}


