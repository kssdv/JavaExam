package aRank;

import java.util.Scanner;

public class exam29 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Y = sc.nextInt();
		int X = sc.nextInt();
		// DはN, S, E, Wの値の一つ (y,x)
		// N(1,0), S(-1,0), E(0,1), W(0,-1)
		char D = sc.next().charAt(0);
		char d = sc.next().charAt(0);
		
		// N
		if((D == 'E' && d == 'L') || (D == 'W' && d == 'R')) {
			System.out.printf("%d %d", Y-1, X);
		// W
		}else if((D == 'N' && d == 'L') || (D == 'S' && d == 'R')) {
			System.out.printf("%d %d", Y, X-1);
		// S
		}else if((D == 'W' && d == 'L') || (D == 'E' && d == 'R')) {
			System.out.printf("%d %d", Y+1, X);
		// E
		}else if((D == 'N' && d == 'R') || (D == 'S' && d == 'L')) {
			System.out.printf("%d %d", Y, X+1);
		}
		
	}

}
