package aRank;

import java.util.Scanner;

public class exam25 {

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
			grid[y][x] = '#';
		}
		
		for(int i=0; i<h; i++) {
			System.out.println(new String(grid[i]));
		}
	}

}
