package aRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class exam77 {
	// 有向グラフ　「ノード１」→「ノード２」
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[][] g = new int[n][n];
		List<List<Integer>> h = new ArrayList<>();
		
		for(int i=0; i<n; i++) {
			List<Integer> tmp = new ArrayList<>();
			h.add(tmp);
		}
		
		for(int i=0; i<m; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()) - 1;
			int b = Integer.parseInt(st.nextToken()) - 1;
			g[a][b] = 1;
			h.get(a).add(b);
		}
		
		for(int i=0; i<g.length; i++) {
			for(int j=0; j<g[0].length; j++) {
				System.out.print(g[i][j]);
			}
			System.out.println();
		}
		for(List<Integer> tlst : h) {
			Collections.sort(tlst);
			
			for(int i : tlst) {
				System.out.print(i);
			}
			System.out.println();
		}
		
	}

}
