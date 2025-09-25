package myproject02;

import java.util.Scanner;

public class exam44 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		int ball = 0;
		int strike = 0;
		
		
		for(int i=0; i<n; i++) {
			String temp = sc.nextLine();
			if(temp.equals("ball")) {
				ball++;
				System.out.println(ball >= 4 ? "fourball!" : "ball!");
			}else if(temp.equals("strike")) {
				strike++;
				System.out.println(strike >= 3 ? "out!" : "strike!");
			}
		}
	}
}


