//Index of 1

package myproject01;

import java.util.Scanner;

public class exam85 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
		int[] line = str2int(sc.nextLine().split(" "));
		
		for(int i=0; i<line.length; i++) {
			if(line[i] % 2 == 0) {
				System.out.println("even");
			}else {
				System.out.println("odd");
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
