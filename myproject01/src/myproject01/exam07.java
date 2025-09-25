package myproject01;

import java.util.Scanner;

public class exam07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] line = sc.nextLine().split(" ");
		for(int i=0; i<Integer.parseInt(line[0]); i++) {
			if(i == 0) {
				System.out.printf("(%d, %d)", Integer.parseInt(line[1]), Integer.parseInt(line[2]));
			}else {
				System.out.printf(", (%d, %d)", Integer.parseInt(line[1]), Integer.parseInt(line[2]));
			}
		}
		
	}

}
