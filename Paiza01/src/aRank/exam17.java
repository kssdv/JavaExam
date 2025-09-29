package aRank;

import java.util.ArrayList;
import java.util.Scanner;

public class exam17 {

	public static void main(String[] args) {
		// 入力
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		char[] handArray = sc.next().toCharArray();
		
		// 相手ハンド分析
		int[] handCount = new int[3]; //{G, C, P}
		for(char hand : handArray) {
			switch(hand) {
			case 'G':
				handCount[0]++;
				break;
			case 'C':
				handCount[1]++;
				break;
			case 'P':
				handCount[2]++;
				break;
			}//switch
		}//for
		
		// ハンドパターン列挙
		ArrayList<Integer[]> patternList = new ArrayList<>(100);
		for(int i=0; i<=n; i++) {
			for(int j=0; j<=n; j++) {
				int yubi = i * 2 + j * 5; // 指数
				int remain = n - i - j; // 残勝負数
				
				if(yubi == m && remain >= 0) {
					// 総勝負数内に指を使い切る組み合わせ
					Integer[] pattenr = {remain, i, j};
					patternList.add(pattenr);
				}else if(yubi > m || remain < 0) {
					// 勝負数を使い切るか、指数がオーバーしたら次のループ
					break;
				}
			}
		}
		
//		for(Integer[] pattern : patternList) {
//			System.out.println(pattern[0]+" "+pattern[1]+" "+pattern[2]);
//		}
		int maxWin = 0;
		for(Integer[] pattern : patternList) {
			int win = 0;
			// 自分がパーで勝つ回数 = min(相手のグーの数、自分のパーの数)
			win += Math.min(handCount[0], pattern[2]);
			// 自分がチョキで勝つ回数 = min(相手のパーの数、自分のチョキの数)
			win += Math.min(handCount[2], pattern[1]);
			// 自分がグーで勝つ回数 = min(相手のチョキの数、自分のグーの数)
			win += Math.min(handCount[1], pattern[0]);
			
			if(win > maxWin) maxWin = win; //これまでの最大勝利数より大きければ更新
		}
		
		System.out.println(maxWin);
	}

}
