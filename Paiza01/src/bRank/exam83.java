package bRank;

import java.util.Scanner;

public class exam83 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		String[] words = new String[n];
		int min = 0;
		int cnt = 0;
		
		for(int i=0; i<n; i++) {
			String tmp = sc.nextLine();
			words[i] = tmp;
		}
		
		min = words[0].length() < words[1].length() ? words[0].length() : words[1].length();
		
		for(int i=0; i<min; i++) {
			if(words[0].charAt(i) == words[1].charAt(i)) {
				cnt++;
			}else {
				break;
			}
		}
		System.out.println(cnt);
	}
}
