package myproject01;

import java.util.Scanner;

public class exam67 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		int[] lst = str2int(sc.nextLine().split(" "));
		int cnt_k = 0;
		int cnt_g = 0;
		
		for(int i : lst) {
			if(i % 2 == 0) {
				cnt_g++;
			}else {
				cnt_k++;
			}
		}
		
		System.out.println(cnt_g+" "+cnt_k);
	}
	
	public static int[] str2int(String[] str) {
		int[] lst = new int[str.length];
		for(int i=0; i<str.length; i++) {
			lst[i] = Integer.parseInt(str[i]);
		}
		return lst;
	}
}
