package myproject02;

import java.util.Scanner;

public class exam57 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = Integer.toBinaryString(Integer.parseInt(sc.nextLine()));
		char target = '1';
		
		long count = str.chars()
				.filter(ch -> ch == target)
				.count();
		System.out.println(count);
	}
}
