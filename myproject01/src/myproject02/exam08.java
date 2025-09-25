//500 1000 300

package myproject02;

import java.util.Scanner;

public class exam08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		for(int i=0; i<n; i++) {
			String[] t = sc.nextLine().split(" ");
			System.out.println(t[0]+" "+(Integer.parseInt(t[1])+1));
		}
	}
	
	public static int[] str2int(String[] slst) {
		int[] lst = new int[slst.length];
		for(int i=0; i<slst.length; i++) {
			lst[i] = Integer.parseInt(slst[i]);
		}
		
		return lst;
	}
}
