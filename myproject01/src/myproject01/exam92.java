//Index of 1

package myproject01;

import java.util.Scanner;

public class exam92 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
		int[] num = str2int(sc.nextLine().split(" "));
		
		for(int i=0; i<num.length; i++) {
			if(num[i] == 1) {
				System.out.println(i+1);
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
