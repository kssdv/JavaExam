package aRank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exam28 {
	private static List<int[]> yoko(char[][] grid) {
		List<int[]> result = new ArrayList<>();
		int h = grid.length;
		int w = grid[0].length;
		
		if(w >= 2) {
			for(int i=0; i<h; i++) {
				for(int j=0; j<w; j++) {
					if(j == 0) { // 左上端
						if(grid[i][j+1] == '#') {
//							System.out.println(i+" "+j);
							result.add(new int[] {i,j});
						}
					}else if(j == w - 1) { // 右上端
						if(grid[i][j-1] == '#') {
//							System.out.println(i+" "+j);
							result.add(new int[] {i,j});
						}
					}else {
						if(grid[i][j+1] == '#' && grid[i][j-1] == '#') {
//							System.out.println(i+" "+j);
							result.add(new int[] {i,j});
						}
					}
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		char[][] grid = new char[h][w];
		for(int i=0; i<h; i++) {
			String tmp = sc.next();
			grid[i] = tmp.toCharArray();
		}
		List<int[]> lst = yoko(grid);
		for(int[] t : lst) {
//			System.out.println(t[0]+" "+t[1]);
			if(h >= 2) {
				int i = t[0];
				int j = t[1];
				if(i == 0) { // 左上端
					if(grid[i+1][j] == '#') {
						System.out.println(i+" "+j);
					}
				}else if(i == h - 1) { // 右上端
					if(grid[i-1][j] == '#') {
						System.out.println(i+" "+j);
					}
				}else {
					if(grid[i+1][j] == '#' && grid[i-1][j] == '#') {
						System.out.println(i+" "+j);
					}
				}
			}
		}
	}

}
