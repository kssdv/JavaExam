package bRank;

import java.util.Scanner;

public class exam87 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] hw = str2int(sc.nextLine().split(" "));
		int h = hw[0];
		int w = hw[1];
		String[][] grid = new String[h][w];
		int[] ichi = {0, 0};
		int[] move = {1, 0};
		int cnt = 0;
		int[] zahyo = {0, 0};
		
		for(int i=0; i<h; i++) {
			String tmp = sc.nextLine();
			grid[i] = tmp.split("");
		}
		// int[] move = {1, 0}; 右向き
		while(zahyo[0] < w || zahyo[1] < h) {
//			grid[ichi[0]][ichi[1]]
			if(ichi[0] >= w || ichi[0] < 0 || ichi[1] >= h || ichi[1] < 0) {break;}
			if(grid[ichi[1]][ichi[0]].equals("S")) {
				cnt++;
//				if(ichi[0] + move[0] >= w || ichi[1] + move[1] > h) {
				if(ichi[0] + move[0] >= w || ichi[0] + move[0] < 0 || ichi[1] + move[1] >= h || ichi[1] + move[1] < 0) {
					break;
				}
				ichi[0] += move[0];
				ichi[1] += move[1];
				if(ichi[0] >= w || ichi[0] < 0 || ichi[1] >= h || ichi[1] < 0) {break;}
			}else if(grid[ichi[1]][ichi[0]].equals("U")) {
				cnt++;
				move[0] = 0;
				move[1] = -1;
				if(ichi[0] + move[0] >= w || ichi[0] + move[0] < 0 || ichi[1] + move[1] >= h || ichi[1] + move[1] < 0) {
					break;
				}
				ichi[0] += move[0];
				ichi[1] += move[1];
				if(ichi[0] >= w || ichi[0] < 0 || ichi[1] >= h || ichi[1] < 0) {break;}
			}else if(grid[ichi[1]][ichi[0]].equals("D")) {
				cnt++;
				move[0] = 0;
				move[1] = 1;
				if(ichi[0] + move[0] >= w || ichi[0] + move[0] < 0 || ichi[1] + move[1] >= h || ichi[1] + move[1] < 0) {
					break;
				}
				ichi[0] += move[0];
				ichi[1] += move[1];
				if(ichi[0] >= w || ichi[0] < 0 || ichi[1] >= h || ichi[1] < 0) {break;}
			}else if(grid[ichi[1]][ichi[0]].equals("R")) {
				cnt++;
				move[0] = 1;
				move[1] = 0;
				if(ichi[0] + move[0] >= w || ichi[0] + move[0] < 0 || ichi[1] + move[1] >= h || ichi[1] + move[1] < 0) {
					break;
				}
				ichi[0] += move[0];
				ichi[1] += move[1];
				if(ichi[0] >= w || ichi[0] < 0 || ichi[1] >= h || ichi[1] < 0) {break;}
			}else if(grid[ichi[0]][ichi[1]].equals("L")) {
				cnt++;
				move[0] = -1;
				move[1] = 0;
				if(ichi[0] + move[0] >= w || ichi[0] + move[0] < 0 || ichi[1] + move[1] >= h || ichi[1] + move[1] < 0) {
					break;
				}
				ichi[0] += move[0];
				ichi[1] += move[1];
				if(ichi[0] >= w || ichi[0] < 0 || ichi[1] >= h || ichi[1] < 0) {break;}
			}
		}
		
		System.out.println(cnt);
	}
	
	static int[] str2int(String[] str) {
		int[] lst = new int[str.length];
		for(int i=0; i<str.length; i++) {
			lst[i] = Integer.parseInt(str[i]);
		}
		return lst;
	}
}
