// '2 3 7 8'
package myproject01;

import java.util.Scanner;

public class exam09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] line = sc.nextLine().split(" ");
		int num1 = Integer.parseInt(line[0]);
		int num2 = Integer.parseInt(line[1]);
		int num3 = Integer.parseInt(line[2]);
		int num4 = Integer.parseInt(line[3]);
		int haba = 22 * num2 + 3 * (num2 - 1);
//		String.format("(%9d,%9d)",num3, num4);
//		System.out.println(String.format("(%9d,%9d)",num3, num4));
		for(int i=0; i<num1; i++) {
			if(i != 0) {
				for(int l=0; l<haba; l++) {
					System.out.print("=");
				}
				System.out.println();
			}
			for(int j=0; j<num2; j++) {
				if(j != 0) {
					System.out.print(" | ");
				}
				System.out.print(String.format("(%9d, %9d)",num3, num4));
			}
			System.out.println();
		}
	}
}
