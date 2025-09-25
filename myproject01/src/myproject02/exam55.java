package myproject02;

import java.util.Scanner;

// max 1500
public class exam55 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		String s = "";
		
		while(n > 0) {
			int t = n % 2;
			s = t + s;
			n /= 2;
		}
		int cnt = 0;
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) == '1') cnt++;
		}
		System.out.println(cnt);
	}
}


