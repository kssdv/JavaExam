//500 1000 300

package myproject02;

import java.util.Scanner;

public class exam14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		int[] lst = new int[n];
		boolean flag = false;
		for(int i=0; i<n; i++) {
			lst[i] = Integer.parseInt(sc.nextLine());
		}
		int k = Integer.parseInt(sc.nextLine());
		int idx = 0;
		for(int i=0; i<lst.length; i++) {
			if (lst[i] == k) {
				idx=i; 
				break;
			}
		}
		
		System.out.println(idx+1);
		
	}
	
	public static int[] str2int(String[] slst) {
		int[] lst = new int[slst.length];
		for(int i=0; i<slst.length; i++) {
			lst[i] = Integer.parseInt(slst[i]);
		}
		
		return lst;
	}
}
