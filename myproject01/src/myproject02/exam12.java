//500 1000 300

package myproject02;

import java.util.Scanner;

public class exam12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] a = sc.nextLine().split("");
		System.out.println((Integer.parseInt(a[0])+Integer.parseInt(a[3]))+""+(Integer.parseInt(a[1])+Integer.parseInt(a[2])));
	}
	
	public static int[] str2int(String[] slst) {
		int[] lst = new int[slst.length];
		for(int i=0; i<slst.length; i++) {
			lst[i] = Integer.parseInt(slst[i]);
		}
		
		return lst;
	}
}
