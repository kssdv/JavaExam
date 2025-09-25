//Index of 1

package myproject01;

import java.util.Scanner;

public class exam93 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int cnt = 0;
		
		for(int i=1; i<=num; i++) {
			if(num % i == 0) {
				cnt++;
				System.out.println(i);
			}
		}
		
//		System.out.println(cnt);
	}
	
	public static int[] str2int(String[] str) {
		int[] lst = new int[str.length];
		for(int i=0; i<str.length; i++) {
			lst[i] = Integer.parseInt(str[i]);
		}
		return lst;
	}
}
