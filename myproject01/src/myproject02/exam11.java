//500 1000 300

package myproject02;

import java.util.Scanner;

public class exam11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] t = sc.nextLine().split(":");
		int h = t[0].charAt(0) == '0' ? Integer.parseInt(t[0].charAt(1)+"") : Integer.parseInt(t[0]);
		int m = t[1].charAt(0) == '0' ? Integer.parseInt(t[1].charAt(1)+"") : Integer.parseInt(t[1]);
		
		m += 30;
		
		if(m >= 60) {
			h++;
			m-=60;
			if(h >= 24) {
				h -= 24;
			}
		}
		System.out.printf("%02d:%02d",h,m);
		
	}
	
	public static int[] str2int(String[] slst) {
		int[] lst = new int[slst.length];
		for(int i=0; i<slst.length; i++) {
			lst[i] = Integer.parseInt(slst[i]);
		}
		
		return lst;
	}
}
