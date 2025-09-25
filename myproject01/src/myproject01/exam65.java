package myproject01;

import java.util.Scanner;

public class exam65 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String[] line = sc.nextLine().split(" ");
        System.out.println(Integer.parseInt(line[0]) >= 10 && Integer.parseInt(line[1]) >= 10 ? "YES" : "NO");
	}
}
