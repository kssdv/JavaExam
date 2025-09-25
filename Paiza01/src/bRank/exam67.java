package bRank;

import java.util.Scanner;

public class exam67 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] num = sc.nextLine().split(" ");
		String[][] grid = 
			{{"#", ".", "#", "."},
			{".", "#", "#", "#"},
			{"#", ".", ".","#"}};
		int[][] bomb = new int[grid.length][grid[0].length];
		bomb[0][3] = 1;
		bomb[2][2] = 2;
		bomb[0][1] = 1;
		
		bombPlant(grid, bomb);
		printGrid(grid);
		
		explode(grid, bomb, 2, 2, bomb[2][2]);
		System.out.println();
		printGrid(grid);
		
		calEndOfExplode(grid, bomb);
		System.out.println();
		printGrid(grid);
		
		explode(grid, bomb, 0, 3, 1);
		System.out.println();
		printGrid(grid);
		calEndOfExplode(grid, bomb);
		System.out.println();
		printGrid(grid);
		
	}
	
	static void bombPlant(String[][] grid, int[][] bomb) {
//		for(int i=0; i<bomb.length; i++) {
//			int y = bomb[i][0];
//			int x = bomb[i][1];
//			int r = bomb[i][2];
//			grid[y][x] = "$";
//		}
		for(int y=0; y<bomb.length; y++) {
			for(int x=0; x<bomb[0].length; x++) {
				if(bomb[y][x] > 0) {
					grid[y][x] = "$";
				}
			}
		}
	}
	
	static String[][] explode(String[][] grid, int[][] bomb, int p, int q, int r){
		grid[p][q] = "o";
		for(int y=0; y<grid.length; y++) {
			for(int x=0; x<grid[0].length; x++) {
				if(r >= calculateManhattanDistance(x, q, y, p)) {
					// 爆破範囲内の他の爆弾がある場合連鎖爆発
					if(grid[y][x].equals("$")) {
						explode(grid, bomb, y, x, bomb[y][x]);
						System.out.println("連鎖爆発");
					}else {
						grid[y][x] = "o";
					}
				}
			}
		}
	
		return grid;
	}
	
	static int calculateManhattanDistance(int x1, int x2, int y1, int y2) {
		return Math.abs(x1 - x2) + Math.abs(y1 - y2);
	}
	
	static String[][] calEndOfExplode(String[][] grid, int[][] bomb) {
		for(int y=grid.length-1; y>=0; y--) {
			for(int x=grid[0].length-1; x>=0; x--) {
				while(grid[y][x].equals("o")) {
					for(int k=y; k>0; k--) {
						grid[k][x] = grid[k-1][x];
						// 爆弾の落下の際bombの情報の更新
						if(grid[k-1][x].equals("$")) {
							bomb[k][x] = bomb[k-1][x];
							bomb[k-1][x] = 0;
						}
					}
					grid[0][x] = ".";
				}
			}
		}
		
		return grid;
	}
	
	static void printGrid(String[][] grid) {
		for(String[] g : grid) {
			System.out.println(String.join("", g));
		}
	}
}
