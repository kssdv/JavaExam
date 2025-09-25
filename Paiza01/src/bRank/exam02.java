// マップの書き換え・縦横Java編（paizaランクB相当）
// https://paiza.jp/works/mondai/b_rank_new_level_up_problems/b_rank_new_level_up_problems__get_upsidedown/edit?language_uid=java&t=ada40a804666ccb369e6c4c005ee7c2d
package bRank;

import java.util.Scanner;

public class exam02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] hw = sc.nextLine().split(" ");
		int h = Integer.parseInt(hw[0]);
		int w = Integer.parseInt(hw[1]);
		String[][] zahyo = new String[h][w];
		
		// data input
		for(int i=0; i<h; i++) {
			String[] temp = sc.nextLine().split("");
			for(int j=0; j<temp.length; j++) {
				zahyo[i][j] = temp[j];				
			}
		}
		
		// 修正
		String[] xy = sc.nextLine().split(" ");
		int y = Integer.parseInt(xy[0]);
		int x = Integer.parseInt(xy[1]);
		
		// ToDo - 該当の座標とその周囲の
		
		// print
		for(String[] sl : zahyo) {
			for(String s : sl) {
				System.out.print(s);
			}
			System.out.println();
		}
	}

}
