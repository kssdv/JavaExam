package myproject01;

import java.util.Scanner;

public class exam05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());
		for (int i=0; i<num; i++) {
			String[] temp1 = sc.nextLine().split(" ");
			System.out.println(String.format("%."+temp1[1]+"f", Double.parseDouble(temp1[0])));
		}
	}

}
