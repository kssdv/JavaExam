package bRank;

import java.util.Scanner;

public class exam85 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int[] nm = str2int(sc.nextLine().split(" "));
		int n = Integer.parseInt(sc.nextLine());
//		int[][] grid = new int[nm[0]][nm[1]];
		int x = 1;
		int y = 0;
		int cnt = 0;
//		* 右向き → 1 0
//		* 左向き → -1 0
//		* 上向き → 0 -1
//		* 下向き → 0 1
		
//		for(int n=0; n<nm[0]; n++) {
//			String[] tmp = sc.nextLine().split("");
//			for(int t=0; t<tmp.length; t++) {
//				grid[n][t] = tmp[t].equals("/") ? 1 : tmp[t].equals("_") ? 0 : 2;
//			}
//		}
		
		for(int i=0; i<n; i++) {
			int tmp[] = reflection(sc.nextLine(), x, y);
			x = tmp[0];
			y = tmp[1];
			cnt += tmp[2];
//			System.out.println(x+" "+y);
		}
		System.out.println(cnt);
		
//		printGrid(grid);
	}
	
	private static int[] reflection(String m, int x, int y) {
//		int[] res = new int[2];
		int[] res = new int[3];
		res[2] = 0;
		int im = m.equals("/") ? 1 : m.equals("_") ? 0 : 2;
		
		// '/' 反射
		if(im == 1) {
			res[2]++;
			if(x == 1 && y == 0) {
				res[0] = 0;
				res[1] = -1;
				return res;
			}else if(x == -1 && y == 0) {
				res[0] = 0;
				res[1] = 1;
				return res;
			}else if(x == 0 && y == 1) {
				res[0] = -1;
				res[1] = 0;
				return res;
			}else if(x == 0 && y == -1) {
				res[0] = 1;
				res[1] = 0;
				return res;
			}
		// '\' 反射
		}else if(im == 2) {
			res[2]++;
			if(x == 1 && y == 0) {
				res[0] = 0;
				res[1] = 1;
				return res;
			}else if(x == -1 && y == 0) {
				res[0] = 0;
				res[1] = -1;
				return res;
			}else if(x == 0 && y == 1) {
				res[0] = 1;
				res[1] = 0;
				return res;
			}else if(x == 0 && y == -1) {
				res[0] = -1;
				res[1] = 0;
				return res;
			}
		// '_' 通過
		}else if(im == 0) {
			res[0] = x;
			res[1] = y;
			return res;
		}
		
		return res;
	}
	
	private static void printGrid(int[][] grid) {
		for(int i=0; i<grid.length; i++) {
			for(int j=0; j<grid[0].length; j++) {
				System.out.print(j != 0 ? " "+grid[i][j] : ""+grid[i][j]);
			}
			System.out.println();
		}
	}
	
	static int[] str2int(String[] str) {
		int[] lst = new int[str.length];
		for(int i=0; i<str.length; i++) {
			lst[i] = Integer.parseInt(str[i]);
		}
		return lst;
	}
}
