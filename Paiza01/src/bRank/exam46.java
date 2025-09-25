package bRank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exam46 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		Hashtable<String, String> dictionary = new Hashtable<>();
		List<String> dictionary = new ArrayList<>();
		List<String> words = new ArrayList<>();
		String[] num = sc.nextLine().split(" ");
		int n = Integer.parseInt(num[0]);
		int k = Integer.parseInt(num[1]);
		int m = Integer.parseInt(num[2]);
		boolean[] people = new boolean[n];
		String lastWord = "";
		
		// 辞書に単語保存
		for(int i=0; i<k; i++) {
			String tmp = sc.nextLine();
			dictionary.add(tmp);
		}
		// ゲームの流れ
		for(int i=0; i<m; i++) {
			String word = sc.nextLine();
			// 通過したのか
			if(isCorrect(word, dictionary, lastWord, words)) {
				
			}else {
				word = "";
				people[i] = false;
			}
			lastWord = word;
			
		}
	}
	
	public static boolean isCorrect(String word, List<String> dictionary, String lastWord, List<String> words) {
		boolean flag = true;
		// 停止した単語が単語リストにあるかを確認
		if(dictionary.contains(word) && flag) {
//			flag = false;
		}else {flag = false;}
		// 以前単語の最後文字と現在単語の最初が一致するのかを比較
		if(lastWord.charAt(lastWord.length()-1) == word.charAt(0) || lastWord.isEmpty()) {
//			flag = false;
		}else {flag = false;}
		// 二回発言したのかを確認
		if(words.contains(word) && flag) {
//			flag = false;
		}else {flag = false;}
		// 単語の最後が"z"で終わるのかを確認
		if(word.charAt(word.length()-1) == 'z' && flag) {
//			flag = false;
		}else {flag = false;}
		
		return flag;
	}
	
	public static void printTimes(List<Integer> lst, int n) {
		int cnt = 0;
		int idx = 0;
		while(cnt < n) {
			System.out.println(lst.get(idx));
			idx = lst.size() <= idx + 1 ? idx + 1 - lst.size() : idx + 1;
			cnt++;
		}
	}
}
