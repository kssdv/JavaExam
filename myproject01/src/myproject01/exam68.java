package myproject01;
// 1日（日曜日）、二日（月曜日）…
import java.util.Scanner;

public class exam68 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1, 2, 3, ...
		String[] week = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
		int n = sc.nextInt();
		System.out.println(week[(n-1) % 7]);
	}
}
