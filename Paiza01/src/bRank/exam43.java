package bRank;

import java.util.Scanner;

public class exam43 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int[][] scoreboard = new int[3][3];
		int point = 0;
		String str = sc.nextLine();
		str += " " + sc.nextLine();
		str += " " + sc.nextLine();
		int[] scoreboard = str2int(str.split(" "));
		// 基本値はfalse
		boolean[] stroke = new boolean[9];
		int cntBingo = 0;
		
		for(int i=0; i<9; i++) {
			int[] tlst = str2int(sc.nextLine().split(" "));
			boolean flag = true;
			for(int j=0; j<tlst.length; j++) {
				// 倒した時のポイントの追加、パネルを倒して点数を得るのは一回だけ
				if(flag) {
					point += scoreboard[i];
					flag = false;
				}
				stroke[i] = true;
				
				// To Do ビンゴのカウントと以前の個数と比較、増えた場合点数の追加
				stroke[i] = true;
				int tcntBingo = cntBingo(stroke);
				if(cntBingo < tcntBingo) {
					cntBingo = tcntBingo;
					point += tlst[j];
				}
			}
		}
		System.out.println(point);
	}
	
	public static int cntBingo(boolean[] f) {
		int sum = 0;
		if(f[0] && f[1] && f[2]) {
			sum++;
		}
		if(f[3] && f[4] && f[5]) {
			sum++;
		}
		if(f[6] && f[7] && f[8]) {
			sum++;
		}
		if(f[0] && f[3] && f[6]) {
			sum++;
		}
		if(f[1] && f[4] && f[7]) {
			sum++;
		}
		if(f[2] && f[5] && f[8]) {
			sum++;
		}
		if(f[0] && f[4] && f[8]) {
			sum++;
		}
		if(f[2] && f[4] && f[6]) {
			sum++;
		}
		
		return sum;
	}
	
//	public static int countBingo() {
//		int cnt = 0;
//		
//		
//		return cnt;
//	}
	
	public static int[] str2int(String[] str) {
		int[] lst = new int[str.length];
		for(int i=0; i<str.length; i++) {
			lst[i] = Integer.parseInt(str[i]);
		}
		return lst;
	}
}
