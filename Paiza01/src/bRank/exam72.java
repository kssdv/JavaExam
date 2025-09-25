package bRank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exam72 {
	// しりとり
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = str2int(sc.nextLine().split(" "));
		int n = num[0];
		int k = num[1];
		int m = num[2];
		List<String> dictionary = new ArrayList<>();
		int[] people = new int[n];
		List<String> wlst = new ArrayList<>();
		String preword = "";
		int idx = 0;
		int cnt = 0;
		
		for(int i=0; i<people.length; i++) {
			people[i] = i+1;
		}
		
		// 使う単語リスト
		for(int i=0; i<k; i++) {
			String tmp = sc.nextLine();
			dictionary.add(tmp);
		}
		// 発言リスト
		for(int i=0; i<m; i++) {
			while(people[idx] < 0) {
				idx++;
				if(idx >= people.length) {
					idx -= people.length;
				}
			}
			
			String word = sc.nextLine();
			boolean isPassed = false;
			
			if(preword.isEmpty()) {
				isPassed = true;
			}else if(preword.charAt(preword.length()-1) == word.charAt(0)){
				 isPassed = true;
			}
			
			if(isPassed &&
					dictionary.contains(word) && 
					!wlst.contains(word) && 
					!(word.charAt(word.length()-1) == 'z')) {
				
				preword = word;
				wlst.add(word);
			}else {
				preword = "";
				people[idx] = -1;
			}
			
			if(idx+1 >= people.length) {
				idx++;
				idx -= people.length;
			}else {
				idx++;
			}
		}
		for(int i=0; i<people.length; i++) {
			if(people[i] > 0) {
				cnt++;
			}
		}
		System.out.println(cnt);
		for(int i=0; i<people.length; i++) {
			if(people[i] > 0 ) {
				System.out.println(people[i]);
			}
		}
	}
	
	private static int[] str2int(String[] str) {
		int[] lst = new int[str.length];
		for(int i=0; i<str.length; i++) {
			lst[i] = Integer.parseInt(str[i]);
		}
		
		return lst;
	}
}
