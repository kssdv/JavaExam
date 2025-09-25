package myproject02;

import java.util.Scanner;

// max 1500
public class exam54 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int cnt = 0;
		
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) == '1') cnt++;
		}
		System.out.println(cnt);
	}
}


