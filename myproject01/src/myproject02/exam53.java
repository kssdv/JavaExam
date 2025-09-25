package myproject02;

import java.util.Scanner;

// max 1500
public class exam53 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
//		int n = 7;
		String s = "";
		
		while(n >0) {
			s = n % 2 + s;
			n /= 2;
		}
		int cnt = 0;
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) == '1') {
				cnt++;
			}
		}
		System.out.println(cnt);
//		System.out.println(s);
		
		
	}
}


