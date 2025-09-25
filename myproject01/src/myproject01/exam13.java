package myproject01;

import java.util.Scanner;

public class exam13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] temp = sc.nextLine().split(" ");
		int tate = Integer.parseInt(temp[0]);
		int yoko = Integer.parseInt(temp[1]);
		
		int tate2 = Integer.parseInt(temp[2]) - 1;
		int yoko2 = Integer.parseInt(temp[3]) - 1;
		
		for(int i=0; i<tate; i++) {
			String line = sc.nextLine();
			if(tate2 == i) {
				if(line.substring(yoko2, yoko2+1).equals("#")) {
					System.out.println("Yes");
				} else if(line.substring(yoko2, yoko2+1).equals(".")) {
					System.out.println("No");
				}
			}
		}
	}
}
