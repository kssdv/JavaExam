package aRank;

import java.util.Scanner;

public class exam03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] nx = str2int(sc.nextLine().split(" "));
		int[] okashi = new int[nx[1]];
		int money = nx[1];
		int min = Integer.MAX_VALUE;
		
		for(int i=0; i<nx[0]; i++) {
			int tmp = Integer.parseInt(sc.nextLine());
			okashi[i] = tmp;
			int tsuri = money - tmp;
			// 一個買うとき
			if(min > tsuri && tsuri >= 0) {
				min = tsuri;
			}
		}
		
		// 一個買うとき
//		for(int i=0; i<okashi.length; i++) {
//			
//		}
		// 二個買うとき
		for(int i=0; i<okashi.length-1; i++) {
			for(int j=i+1; j<okashi.length; j++) {
				int t1 = okashi[i];
				int t2 = okashi[j];
				int tsuri = money - (t1 + t2);
				
				if(min > tsuri && tsuri >= 0) {
					min = tsuri;
				}
			}
		}
		System.out.println(min);
	}
	static int[] str2int(String[] str) {
		int[] lst = new int[str.length];
		for(int i=0; i<str.length; i++) {
			lst[i] = Integer.parseInt(str[i]);
		}
		
		return lst;
	}
}
