package myproject02;

import java.util.Scanner;

public class exam21 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		String[] lst = new String[n];
		
		for(int i=0; i<n; i++) {
			String t = sc.nextLine();
			lst[i] = t;
		}
		String name = sc.nextLine();
		
		for(int i=0; i<n; i++) {
			String[] t =lst[i].split(" "); 
			if(t[0].equals(name)) {
				System.out.println(t[1]);
			}
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
