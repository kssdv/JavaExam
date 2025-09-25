package bRank;

import java.util.Scanner;

public class exam82 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] nm = sc.nextLine().split(" ");
		int n = Integer.parseInt(nm[0]);
		int m = Integer.parseInt(nm[1]);
		String[] words = new String[n];
		String tword = "";
		int max = -1;
		int cnt = 0;
		
		if(n == 1) {
			tword = sc.nextLine();
			System.out.println(tword.charAt(0));
		}else {
			// 文字列とターゲット単語の保存
			for(int i=0; i<n; i++) {
				String tmp = sc.nextLine();
				words[i] = tmp;
			}
			tword = words[m-1];
			
			for(int i=0; i<n; i++) {
				if(i != m-1) {
					int idx = 0;
					for(int j=0; j<words[i].length(); j++) {
						if(words[i].charAt(j) == tword.charAt(j)) {
							idx = j;
							cnt++;
						}else {
							break;
						}
					}
					if(max < idx) {
						max = idx;
					}
				}
			}
			if(cnt == 0) {
				System.out.println(tword.charAt(0));
			}else if(max < 0) {
				System.out.println(tword.charAt(0));
			}else {
				System.out.println(tword.length() > 1 ? tword.substring(0, max+1+1) : tword.charAt(0));
			}
		}
	}
}
