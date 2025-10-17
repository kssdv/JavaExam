package aRank;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class exam60 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue<int[]> queue = new LinkedList<>();
		int h = sc.nextInt();
		int w = sc.nextInt();
		char[][] grid = new char[h][w];
		int[] startPoint = new int[2];
		
		for(int i=0; i<h; i++) {
			String line = sc.next();
			for(int j=0; j<w; j++) {
				grid[i][j] = line.charAt(j);
				if(grid[i][j] == '!') {
					startPoint = new int[] {i, j};
				}
			}
		}
		int[] dy = {-1, -1, -1, 0, 1, 1, 1, 0};
		int[] dx = {-1, 0, 1, 1, 1, 0, -1, -1};
		
		grid[startPoint[0]][startPoint[1]] = '*';
		
		for(int i=0; i<8; i++) {
			queue.add(startPoint);
			while(!queue.isEmpty()) {
				int[] current = queue.poll();
				int cy = current[0];
				int cx = current[1];
				
				int ny = cy + dy[i];
				int nx = cx + dx[i];
				
				if(ny < 0 || ny >= h || nx < 0 || nx >= w) {
					continue;
				}
				
				if(grid[ny][nx] == '.') {
					grid[ny][nx] = '*';
				}
			}
		}
		printGrid(grid);
	}
	private static void printGrid(char[][] grid) {
		for(int i=0; i<grid.length; i++) {
			for(int j=0; j<grid[0].length; j++) {
				System.out.print(grid[i][j]);
			}
			System.out.println();
		}
	}
}
