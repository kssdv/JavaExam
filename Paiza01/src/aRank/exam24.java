package aRank;

import java.util.Scanner;

public class exam24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int n = sc.nextInt();
		char[][] grid = new char[h][w];
		
		for(int i=0; i<h; i++) {
			String tmp = sc.next();
			grid[i] = tmp.toCharArray();
		}
		
		for(int i=0; i<n; i++) {
			int y = sc.nextInt();
			int x = sc.nextInt();
			System.out.println(grid[y][x]);
		}
	}

}
