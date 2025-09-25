package myproject01;

import java.util.Scanner;

public class exam08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] line = sc.nextLine().split(" ");
		for(int i=0; i<Integer.parseInt(line[0]); i++) {
			String temp = String.format("(%d, %d)", Integer.parseInt(line[2]), Integer.parseInt(line[3]));
			if(i != 0) {
				int kake = Integer.parseInt(line[1]) * 6 + (Integer.parseInt(line[1])-1) * 3;
				String wake = "";
				for(int x=0; x<kake; x++) {
					wake += "=";
				}
				
				System.out.println("\n"+wake);
			}
			for(int j=0; j<Integer.parseInt(line[1]); j++) {
				String temp1 = temp;
				if(j != 0) {
					temp1 = " | " + temp1;
				}
				System.out.print(temp1);
			}
		}
		
	}

}
