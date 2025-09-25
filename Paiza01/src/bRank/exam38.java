package bRank;

import java.util.Scanner;

public class exam38 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] okcnt = new int[5];
		int[] ngcnt = new int[5];
		int n = Integer.parseInt(sc.nextLine());
		boolean[] isfailed = {false, false, false, false, false};
		
		for(int i=0; i<n; i++) {
			String[] tj = sc.nextLine().split(" ");
			// ex. TA -> A, TB -> B
			char t = tj[0].charAt(1);
			
			if(!isfailed[t-65]) {
				// 不合格の場合
				if(tj[1].equals("ng")) {
					ngcnt[t-65]++;
					if(ngcnt[t-65] >= 2 && okcnt[t-65] < 2) {
						isfailed[t-65] = true;
					}
				}else { // 合格の場合
					okcnt[t-65]++;
				}
			}
		}
		boolean ispassed = false;
		for(int i=0; i<okcnt.length; i++) {
			if(!isfailed[i] && okcnt[i] >= 2) {
				System.out.println((char)(65+i));
				ispassed = true;
				break;
			}
		}
		if(!ispassed) {
			System.out.println("E");
		}
	}
}
