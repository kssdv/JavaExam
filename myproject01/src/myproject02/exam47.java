package myproject02;

import java.util.Scanner;

public class exam47 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] line = sc.nextLine().split(" ");
		int n = Integer.parseInt(line[0]);
		
		for(int i=0; i<Integer.parseInt(line[1]); i++) {
			int temp = Integer.parseInt(sc.nextLine());
			System.out.println(temp % n == 0 ? "Yes" : "No");
		}
	}
}


