
package myproject01;

import java.util.Scanner;

public class exam10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = Integer.parseInt(sc.nextLine());
		String[] line1 = sc.nextLine().split(" ");
		int num2 = Integer.parseInt(sc.nextLine());
		String[] line2 = sc.nextLine().split(" ");
		
		for(int i=0; i<num2; i++) {
			System.out.println(line1[Integer.parseInt(line2[i])-1]);
			
		}
	}
}
