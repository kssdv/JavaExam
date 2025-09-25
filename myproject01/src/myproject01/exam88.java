//Index of 1

package myproject01;

import java.util.Scanner;

public class exam88 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String res = "";
		
		while(n > 0) {
			res = n % 2 + res;
			n /= 2;
		}
		
		System.out.println(res);
	}
	
	public static int[] str2int(String[] str) {
		int[] lst = new int[str.length];
		for(int i=0; i<str.length; i++) {
			lst[i] = Integer.parseInt(str[i]);
		}
		return lst;
	}
}
