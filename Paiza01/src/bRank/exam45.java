package bRank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exam45 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] num = sc.nextLine().split(" ");
		List<String> dictionary = new ArrayList<>();
		List<String> words = new ArrayList<>();
		int n = Integer.parseInt(num[0]);
		int k = Integer.parseInt(num[1]);
		int m = Integer.parseInt(num[2]);
		int personCount = m;
		boolean flag = true;
		String lastWord = "";
		
		// 単語リストに保存
		for(int i=0; i<k; i++) {
			String tmp = sc.nextLine();
			dictionary.add(tmp);
		}
		// 
		for(int i=0; i<m; i++) {
			String word = sc.nextLine();
			int cnt = 0;
			
			// 停止した単語が単語リストにあるかを確認
//			if(!(dictionary.contains(word) && flag)) {
			if(dictionary.contains(word) && flag) {
//				flag = false;
				cnt++;
			}else {flag = false;}
			// 以前単語の最後文字と現在単語の最初が一致するのかを比較
//			if(!(lastWord.charAt(lastWord.length()-1) == word.charAt(0))) {
			if(lastWord.charAt(lastWord.length()-1) == word.charAt(0) || lastWord.isEmpty()) {
//				flag = false;
				cnt++;
			}else {flag = false;}
			// 二回発言したのかを確認
//			if(!(words.contains(word))) {
			if(words.contains(word) && flag) {
//				flag = false;
				cnt++;
			}else {flag = false;}
			// 単語の最後が"z"で終わるのかを確認
//			if(!(word.charAt(word.length()-1) == 'z')) {
			if(word.charAt(word.length()-1) == 'z' && flag) {
//				flag = false;
				cnt++;
			}else {flag = false;}
			
			if(cnt < 4) {
				personCount--;
			}
			word = "";
			words.add(word);
			lastWord = word;
		}
	}
}
