/*
142358
3
195283
167358
142359
 */

package myproject02;

import java.util.Scanner;

public class exam43 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		int ball = 0;
		int strike = 0;
		
		for(int i=0; i<n; i++) {
			String temp = sc.nextLine();
			if(temp.equals("ball")) {
				ball++;
				System.out.println(ball < 4 ? "ball!" : "fourball!");
			}else if(temp.equals("strike")) {
				strike++;
				System.out.println(strike < 3 ? "strike!" : "out!");
			}
		}
	}
}


