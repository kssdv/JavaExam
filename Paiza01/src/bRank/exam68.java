package bRank;

import java.util.Scanner;

public class exam68 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = str2int(sc.nextLine().split(" "));
		String[][] grid = new String[num[0]][num[1]];
		String[] plan = new String[num[2]];
		int[][] bomb = new int[num[0]][num[1]];
		
		// input grid data
		for(int i=0; i<num[0]; i++) {
			grid[i] = sc.nextLine().split("");
		}
		// Bomb Plant
		for(int i=0; i<num[2]; i++) {
			String[] t = sc.nextLine().split(" ");
			int p = Integer.parseInt(t[0]);
			int q = Integer.parseInt(t[1]);
			grid[p][q] = "$"+t[2];
		}
		
		// add Operation order
		int[] xs = str2int(sc.nextLine().split(" "));
		
	}
	
	private static int[] str2int(String[] str) {
		int[] lst = new int[str.length];
		for(int i=0; i<str.length; i++) {
			lst[i] = Integer.parseInt(str[i]);
		}
		
		return lst;
	}
	
	static int calculateManhattanDistance(int x1, int x2, int y1, int y2) {
		return Math.abs(x1 - x2) + Math.abs(y1 - y2);
	}
}
