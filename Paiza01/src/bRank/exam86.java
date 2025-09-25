package bRank;

import java.util.Hashtable;
import java.util.Scanner;

public class exam86 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] hw = str2int(sc.nextLine().split(" "));
		int h = hw[0];
		int w = hw[1];
		String[][] grid = new String[h][w];
		int[] move = {1,0}; // 最初は右
		Hashtable<String, int[]> reflection = new Hashtable<>();
		int[] location = {0,0};
		int cnt = 0;
		reflection.put("R", new int[]{1,0});
		reflection.put("L", new int[]{-1,0});
		reflection.put("U", new int[]{0,-1});
		reflection.put("D", new int[]{0,1});
		
		for(int i=0; i<hw[0]; i++) {
			String tmp = sc.nextLine();
			grid[i] = tmp.split("");
		}
		
		while(location[0] < w && location[1] < h && location[0] >= 0 && location[1] >= 0) {
			cnt++;
			if(grid[location[1]][location[0]].equals("S")) {
				location[0] += move[0];
				location[1] += move[1];
			}else if(grid[location[1]][location[0]].equals("R")) {
				move[0] = 1;
				move[1] = 0;
				location[0] += move[0];
				location[1] += move[1];
			}else if(grid[location[1]][location[0]].equals("L")) {
				move[0] = -1;
				move[1] = 0;
				location[0] += move[0];
				location[1] += move[1];
			}else if(grid[location[1]][location[0]].equals("U")) {
				move[0] = 0;
				move[1] = -1;
				location[0] += move[0];
				location[1] += move[1];
			}else if(grid[location[1]][location[0]].equals("D")) {
				move[0] = 0;
				move[1] = 1;
				location[0] += move[0];
				location[1] += move[1];
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
