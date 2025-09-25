package bRank;

import java.util.Scanner;

public class exam69 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = str2int(sc.nextLine().split(" "));
		String[][] grid = new String[num[0]][num[1]];
		int[][] bomb = new int[num[2]][3];
		
		// input grid data
		for(int i=0; i<num[0]; i++) {
			grid[i] = sc.nextLine().split("");
		}
		
		// Bomb Plant
		for(int i=0; i<num[2]; i++) {
			int[] t = str2int(sc.nextLine().split(" "));
			int p1 = t[0]-1;
			int q1 = t[1]-1;
			grid[p1][q1] = "$"+t[2];
			bomb[i][0] = p1;
			bomb[i][1] = q1;
			bomb[i][2] = t[2];
		}
		
		// order of plan
		int[] xs = str2int(sc.nextLine().split(" "));

		for(int xx : xs) {
			int p = bomb[xx-1][0];
			int q = bomb[xx-1][1];
			int r = bomb[xx-1][2];
			
			explode(grid, p, q, bomb);
			calEndOfExplode(grid, bomb);
		}
		printGrid(grid);
		
	}
	
	static void explode(String[][] grid, int p, int q, int[][] bomb) {
//		int r = Integer.parseInt(grid[p][q].substring(1));
		int r=0;
		for(int i=0; i<bomb.length; i++) {
			if(bomb[i][0] == p && bomb[i][1] == q) {
				r = bomb[i][2];
			}
		}
		
		grid[p][q] = "o";
		
		for(int y=0; y<grid.length; y++) {
			for(int x=0; x<grid[0].length; x++) {
				if(r >= calculateManhattanDistance(x, q, y, p) && (p == y || q == x)) {
					if(grid[y][x].contains("$")) {
						explode(grid, y, x, bomb);
					}else {
						grid[y][x] = "o";
					}
				}
			}
		}
	}
	
	static String[][] calEndOfExplode(String[][] grid, int[][] bomb) {
		for(int y=grid.length-1; y>=0; y--) {
			for(int x=grid[0].length-1; x>=0; x--) {
				while(grid[y][x].equals("o")) {
					for(int k=y; k>0; k--) {
						// 爆弾の落下の際bombの情報の更新
						if(grid[k-1][x].contains("$")) {
							for(int i=0; i<bomb.length; i++) {
								if(bomb[i][0] == k-1 && bomb[i][1] == x) {
									bomb[i][0] = k;
									bomb[i][1] = x;
								}
							}
						}
						grid[k][x] = grid[k-1][x];
						
					}
					grid[0][x] = ".";
				}
			}
		}
		
		return grid;
	}
	
	static int calculateManhattanDistance(int x1, int x2, int y1, int y2) {
		return Math.abs(x1 - x2) + Math.abs(y1 - y2);
	}
	
	private static int[] str2int(String[] str) {
		int[] lst = new int[str.length];
		for(int i=0; i<str.length; i++) {
			lst[i] = Integer.parseInt(str[i]);
		}
		
		return lst;
	}
	
	static void printGrid(String[][] grid) {
		for(String[] g : grid) {
			for(String g1 : g) {
				if(g1.contains("$")) {
					System.out.print("$");
				}else {
					System.out.print(g1);
				}
//				System.out.print(g1);
			}
			System.out.println();
		}
	}
}
