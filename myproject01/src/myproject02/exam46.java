package myproject02;

import java.util.Scanner;

public class exam46 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int temp = 3;
		int n = 10;
		int min = (temp / n) * n;
		int max = (temp / n + 1) * n;
//		System.out.println(24 / 10);
		if((max - temp) <= (temp - min)) {
			System.out.println(max);
		}else {
			System.out.println(min);
		}
		System.out.println(min+" "+max);
	}
}


