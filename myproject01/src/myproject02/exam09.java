//500 1000 300

package myproject02;

import java.util.Scanner;

public class exam09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] t = str2int(sc.nextLine().split(" "));
		int[] coin = {1, 0, 0};
		if(t[0] > t[1]) {
			coin[1] = t[1];
			coin[2] = t[0];
		}else {
			coin[1] = t[0];
			coin[2] = t[1];
		}
		int pay = t[2];
		int cnt = 0;
		
		while(pay > 0) {
			if(pay >= coin[2]) {
				pay = pay - coin[2];
				cnt++;
			}else if(pay >= coin[1]) {
				pay = pay - coin[1];
				cnt++;
			}else {
				pay = pay - coin[0];
				cnt++;
			}
		}
		int temp = cnt;
		cnt = 0;
		pay = t[2];
		while(pay > 0) {
			if(pay >= coin[1]) {
				pay = pay - coin[1];
				cnt++;
			}else if(pay >= coin[2]) {
				pay = pay - coin[2];
				cnt++;
			}else {
				pay = pay - coin[0];
				cnt++;
			}
		}
		System.out.println(cnt < temp ? cnt : temp);
		
	}
	
	public static int[] str2int(String[] slst) {
		int[] lst = new int[slst.length];
		for(int i=0; i<slst.length; i++) {
			lst[i] = Integer.parseInt(slst[i]);
		}
		
		return lst;
	}
}
