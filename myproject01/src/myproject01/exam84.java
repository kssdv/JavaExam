//Index of 1

package myproject01;

import java.util.Scanner;

public class exam84 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] line = sc.nextLine().split(" ");
		
		for(int i=0; i<line.length; i++) {
			System.out.println(line[i]);
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
