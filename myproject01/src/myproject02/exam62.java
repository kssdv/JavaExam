package myproject02;

import java.util.Scanner;

public class exam62 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());
		if(num >= 0 && num < 2) {
			System.out.println("clear");
		}else if(2 >= num && num < 9) {
			System.out.println("clear");
		}else if(num >= 9 && num <= 10) {
			System.out.println("cloudy");
		}
		
	}
}
