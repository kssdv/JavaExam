package myproject01;

import java.util.Scanner;

public class exam96 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = str2int(sc.nextLine().split(" "));
		String[] lst = new String[num[0]];
		for(int i=1; i<=num[1]; i++) {
			lst[i-1] = i+"";
		}
		for(int i=0; i<num[1]; i++) {
			System.out.println(String.join(" ", lst));
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
