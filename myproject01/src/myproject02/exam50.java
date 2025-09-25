package myproject02;

import java.util.Scanner;

// max 1500
public class exam50 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine().split(" ")[0]);
		int mikan = Integer.parseInt(sc.nextLine());
		int cnt = 1;
		
		while(n*cnt < 1501) {
			int t = (n*cnt);
			System.out.println(t+" "+Math.abs(t-mikan));
			cnt++;
		}
	}
	public static int[] str2int(String[] s) {
		int[] lst = new int[s.length];
		for(int i=0; i<s.length; i++) {
			lst[i] = Integer.parseInt(s[i]);
		}
		
		return lst;
	}
}


