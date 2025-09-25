package myproject02;

import java.util.Scanner;

public class exam27 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		int[] num = str2int(sc.nextLine().split(" "));
		int a = num[0];
		int b = num[1];
		int p = 1;
		int k = 1;
		int cnt = 0;
		
		while(true) {
			if(k > n) {
				break;
			}else {
				// pの番
				k += a * p;
				//kの番
				p += k % b;
				cnt++;
			}
		}
		System.out.println(cnt);
	}
	
	public static int[] str2int(String[] slst) {
		int[] lst = new int[slst.length];
		for(int i=0; i<slst.length; i++) {
			lst[i] = Integer.parseInt(slst[i]);
		}
		
		return lst;
	}
}


