package myproject01;

import java.util.Scanner;

public class exam73 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = str2int(sc.nextLine().split(" "));
		if(num[1] * num[2] % num[0] == 0) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
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
