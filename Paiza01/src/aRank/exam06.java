package aRank;

import java.util.Hashtable;
import java.util.Scanner;

public class exam06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Hashtable<Integer, Integer> ht = new Hashtable<>();
//		T B U D L R
		int[] dice = str2int(sc.nextLine().split(" "));
		// 反対側の数字のデータ保存 T-B, L-R, U-D
		ht.put(dice[0], dice[1]);
		ht.put(dice[1], dice[0]);
		ht.put(dice[2], dice[3]);
		ht.put(dice[3], dice[2]);
		ht.put(dice[4], dice[5]);
		ht.put(dice[5], dice[4]);
		int n = Integer.parseInt(sc.nextLine());
		int rotation = 0;
		int prenum = Integer.parseInt(sc.nextLine());;
		
		for(int i=1; i<n; i++) {
			int t = Integer.parseInt(sc.nextLine());
			if(prenum != t) { // サイコロの数字と異なる場合
				if(ht.get(prenum) == t) { // サイコロの反対の数字の場合
					rotation += 2;
				}else { // その他
					rotation++;
				}
			}
			prenum = t;
		}
		System.out.println(rotation);
	}
	static int[] str2int(String[] str) {
		int[] lst = new int[str.length];
		for(int i=0; i<str.length; i++) {
			lst[i] = Integer.parseInt(str[i]);
		}
		
		return lst;
	}
}
