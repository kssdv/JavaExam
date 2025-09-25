//Index of 1

package myproject01;

import java.util.Scanner;

public class exam94 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int line = sc.nextInt();
        String str = "1";
        for(int i=0; i<line; i++) {
        		System.out.println("1 2 3 4 5");
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
