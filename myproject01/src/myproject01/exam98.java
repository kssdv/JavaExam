package myproject01;

import java.util.Scanner;

public class exam98 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine().split(" ")[0]);
		
		for(int i=0; i<num; i++) {
			int sum = 0;
			int[] lst = str2int(sc.nextLine().split(" "));
			for(int j=0; j<lst.length; j++) {
				sum += lst[j];
			}
			System.out.println(sum);
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
