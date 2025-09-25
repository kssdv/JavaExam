// https://qiita.com/mk___/items/d53515817c41e22e77f0
package bRank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exam62 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> lst = new ArrayList<>();
		String[] xmn = sc.nextLine().split(" ");
		int x = Integer.parseInt(xmn[0]);
		int m = Integer.parseInt(xmn[1]);
		int n = Integer.parseInt(xmn[2]);
		
//		for(int i=1; i<=n; i++) {
////			int sum = (int) Math.pow(x, i);
//			int sum = 0;
//			for(int j=1; j<=n; j++) {
//				sum += Math.pow(x, i);
//			}
//			System.out.println(sum%m);
//		}
		for(int i=1; i<=n; i++) {
			int sum = 0;
			for(int j=i; j>0; j--) {
				int tmp = (int) Math.pow(x, j);
//				if(tmp < 0) {
//					tmp += 2147483647;
//					tmp += 1;
//				}
				sum += tmp;
			}
			int t = sum%m;
//			if(t < 0) {
//				t += 2147483647;
//				t += 1;
//			}
			System.out.println(t);
		}
	}
}
