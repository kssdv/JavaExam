package bRank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exam66 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] num = sc.nextLine().split(" ");
		List<String> plan = new ArrayList<>();
		String[][] grid = new String[Integer.parseInt(num[0])][Integer.parseInt(num[1])];
		// y, x
		int[][] bomb = new int[Integer.parseInt(num[0])][Integer.parseInt(num[1])];
		
		// input Grid
		for(int i=0; i<Integer.parseInt(num[0]); i++) {
			grid[i] = sc.nextLine().split("");
		}
		
		// p_1, q_1, r_1 (座標と威力範囲)
		for(int i=0; i<Integer.parseInt(num[2]); i++) {
//			// 爆破後の処理
			String tmp = sc.nextLine();
			int y = Integer.parseInt(tmp.split(" ")[0]) - 1;
			int x = Integer.parseInt(tmp.split(" ")[1]) - 1;
			int r = Integer.parseInt(tmp.split(" ")[2]);
			bomb[y][x] = r;
			grid[y][x] = "$";
			plan.add(tmp);
		}
		
		for(String[] g : grid) {
			System.out.println(String.join("", g));
		}
		System.out.println();
		
		String[] xs = sc.nextLine().split(" ");
		
		for(String pln : xs) {
			int idx = Integer.parseInt(pln)-1;
			String[] tmp = plan.get(idx).split(" ");
			int p = Integer.parseInt(tmp[0]) - 1;
			int q = Integer.parseInt(tmp[1]) - 1;
			int r = Integer.parseInt(tmp[2]);
			explode(grid, bomb, p, q, bomb[p][q]);
			calEndOfExplode(grid, bomb);
		}
		
		for(String[] g : grid) {
			System.out.println(String.join("", g));
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
						printGrid(grid);
						System.out.println("連鎖爆発");
					}else {
						grid[y][x] = "o";
					}
				}
			}
		}
	
		return grid;
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
	
	static int calculateManhattanDistance(int x1, int x2, int y1, int y2) {
		return Math.abs(x1 - x2) + Math.abs(y1 - y2);
	}
	
	static void printGrid(String[][] grid) {
		for(String[] g : grid) {
			System.out.println(String.join("", g));
		}
	}
}
