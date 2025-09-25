//00.00001000000
//0.00001

//000000017263740000000000
//17263740000000000

//00001928.11.000.6790.01930
//1928.1100067900193

package myproject01;

import java.util.Scanner;

public class exam28 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		// only numbers
		System.out.println(line.matches("[0-9]+") ? "YES" : "NO");
	}
}
