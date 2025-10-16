package aRank;
/*
 * 地図の高さ H、地図の横幅 W、距離 D、地図の情報 M_i (1 ≦ i ≦ H) が与えられます。
 * M_i の各行は　'.', '#', '\*' のいずれかのみからなり、
 * '.' は空地、
 * '#'は通行できない道、
 * '\*' は競合店を示します。
 * 全ての競合店からの距離が D 以上である空地の個数を出力してください。	
入力
6 6 3
..#...
.#....
*...*.
*.#...
#.##.*
......

出力
8
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exam49 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int d = sc.nextInt();

        char[][] grid = new char[h][w];
        List<int[]> stores = new ArrayList<>();

        // 1. 지도 정보를 읽고, 가게('*') 위치만 미리 저장
        for (int i = 0; i < h; i++) {
            String row = sc.next();
            for (int j = 0; j < w; j++) {
                grid[i][j] = row.charAt(j);
                if (grid[i][j] == '*') {
                    stores.add(new int[]{i, j});
                }
            }
        }

        int safeLotCount = 0; // 안전한 공터의 개수

        // 2. 지도를 순회하며 공터('.')를 찾음
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {

                // 현재 위치가 공터가 아니면 검사할 필요 없음
                if (grid[i][j] != '.') {
                    continue;
                }

                // 3. 이 공터가 모든 가게로부터 안전한지 확인
                boolean isSafe = true; // 일단 안전하다고 가정

                for (int[] store : stores) {
                    int distance = calDistance(new int[]{i, j}, store);

                    // 가게 중 하나라도 거리가 D보다 가까우면
                    if (distance < d) {
                        isSafe = false; // 이 공터는 안전하지 않음
                        break;          // 더 이상 다른 가게를 확인할 필요가 없으므로 중단
                    }
                }

                // 4. 모든 가게를 확인한 후에도 여전히 안전하다면 카운트 증가
                if (isSafe) {
                    safeLotCount++;
                }
            }
        }

        System.out.println(safeLotCount);
        sc.close();
	}
	
	private static int calDistance(int[] p1, int[] p2) {
		int res = Math.abs(p1[0] - p2[0]) + Math.abs(p1[1] - p2[1]);
		
		return res;
	}

}
