package myproject01;

import java.util.Scanner;

public class exam29 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len = Integer.parseInt(sc.nextLine());
		String[] pw = new String[len];
		int num = Integer.parseInt(sc.nextLine());
		for(int i=0; i<num; i++) {
			String[] ltemp = sc.nextLine().split(" ");
			int itemp = Integer.parseInt(ltemp[0]);
			String stemp = ltemp[1];
			pw[itemp-1] = stemp;
		}
		String str1 = sc.nextLine();
		for(int i=0; i<pw.length; i++) {
			if(pw[i] == null) {
				pw[i] = str1;
			}
		}
		System.out.println(String.join("", pw));
	}
}
