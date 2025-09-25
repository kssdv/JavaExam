package myproject02;

import java.util.Scanner;

// max 1500
public class exam56 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.nextLine());
		
		String b = Integer.toBinaryString(a);
		
		System.out.println(b.charAt(b.length()-1) == '1' ? "Yes" : "No");
	}
}
