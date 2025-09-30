package aRank;

import java.util.Scanner;

public class exam23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// first Line
		int n = sc.nextInt();
		long MOD = 1_000_000_000L;
		
		// reset DP Table 
		long[] dp = new long[3];
		dp[0] = 1; // (合計=0, あまり=0) 一個で始め
		
		// 数列 Aの 各要素に対して繰り返し
		for(int i=0; i<n; i++) {
			int current_a = sc.nextInt();
			int rem = current_a % 3; // 現在要素を3に割ったあまり
			
			// 次の状態を保存するDPテーブル
			long[] next_dp = new long[3];
			
			// 現在DPテーブル(dp)を基づいて次の状態(next_dp)を計算
			for(int j=0; j<3; j++) {
				// 1. 現在要素(current_a)を部分集合に「含まれない場合」
				// -> 合計の余りはjに変わらない
				next_dp[j] = (next_dp[j] + dp[j]) % MOD;
				
				// 2. 現在要素(current_a)を部分集合に含まれる場合
				// -> 合計の余りはjに変わらない
				int next_rem = (j + rem) % 3;
				next_dp[next_rem] = (next_dp[next_rem] + dp[j]) % MOD;
			}
			// DP テーブルを次の状態に更新
			dp = next_dp;
		}
		// 最終的に合計の余りが0の(つまり、3の倍数)部分集合の個数を
		System.out.println(dp[0]);
		// Scanner リソース解除
		sc.close();
	}

}
