package myproject02;

import java.util.Scanner;

public class exam19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = str2int(sc.nextLine().split(" "));
		
		for(int i=0; i<num[0]; i++) {
			int[] t = str2int(sc.nextLine().split(" "));
			int cnt = 0;
			for(int j=0; j<num[1]; j++) {
				if(t[j] == num[2]) {
					cnt++;
				}
			}
			System.out.println(cnt);
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
