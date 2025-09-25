package bRank;

import java.util.Arrays;
import java.util.Scanner;

// 1
// 3
// ...
public class exam31 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// S_1 ~ S_13, H_1 ~ H_13, D_1 ~ D_13, C_1 ~ C_13
		String[] cards = new String[13*4];
		String[] types = {"S", "H", "D", "C"};
		String[] res = new String[cards.length];
		int cnt = 0;
		for(int i=0; i<types.length; i++) {
			for(int j=1; j<=13; j++) {
				cards[cnt] = types[i]+"_"+j;
				cnt++;
			}
		}
		int num = sc.nextInt();
		for(int n=0; n<num; n++) {
			cnt = 0;
			for(int i=0; i<cards.length/2; i++) {
				res[cnt] = cards[i];
				cnt++;
				res[cnt] = cards[cards.length/2+i];
				cnt++;
			}
			cards = Arrays.copyOf(res, res.length);
		}
		if(num == 0) {
			for(String s : cards) {
				System.out.println(s);
			}
		}else {
			for(String s : res) {
				System.out.println(s);
			}
		}
	}
}
