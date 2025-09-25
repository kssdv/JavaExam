//Index of 1

package myproject01;

import java.util.Scanner;

public class exam89 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = str2int(sc.nextLine().split(" "));
		int n = num[0];
		
		String res = "";
		
		while(n > 0) {
			res = n % num[1] + res;
			n /= num[1];
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
