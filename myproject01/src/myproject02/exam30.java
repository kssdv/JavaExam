package myproject02;

import java.util.Scanner;

// 序盤１，２会にはダメージ、３回からは式によってダメージの計算
public class exam30 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int p = Integer.parseInt(sc.nextLine());
//		int m = Integer.parseInt(sc.nextLine());
		int m = p * 2;
		int[] dmg_p = {1, 1};
		int[] dmg_m = {1, 1};
		
		int d_p = 0;
		int d_m = 0;
		int cnt = 0;
		
		while(p > 0) {
			cnt++;
			// パイザのターン(攻撃)
			if(cnt > 2) {
				d_m = dmg_p[0] + dmg_p[1];
			}else {
				d_m = 1;
			}
			dmg_m[1] = dmg_m[0];
			dmg_m[0] = d_m;
			m -= d_m;
			// モンスターのターン
			if(cnt > 2) {
				d_p = dmg_m[0] * 2 + dmg_m[1];
			}else {
				d_p = 1;
			}
			dmg_p[1] = dmg_p[0];
			dmg_p[0] = d_p;
			p -= d_p;
		}
		System.out.println(cnt);
	}
}


