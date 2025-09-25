package bRank;

import java.util.ArrayList;
import java.util.List;

public class exam49 {

	public static void main(String[] args) {
		List<String> dictionary = new ArrayList<>();
		List<String> words = new ArrayList<>();
		words.add("a");
		dictionary.add("az");
		dictionary.add("ca");
		dictionary.add("a");
		dictionary.add("app");
		dictionary.add("aloha");
		dictionary.add("az");
		
		String word = "a";
		String lword = "ca";
		if(!isCorrect(word, lword, dictionary, words)) {
			System.out.println(word);
		}
	}
	
	public static boolean isCorrect(String word, String lastWord, List<String> dictionary, List<String> words) {
		boolean flag = true;
		// 停止した単語が単語リストにあるかを確認
		if(dictionary.contains(word) && flag) {
//			flag = false;
		}else {
			flag = false;
			return false;
			}
		// 以前単語の最後文字と現在単語の最初が一致するのかを比較
		if(lastWord.charAt(lastWord.length()-1) == word.charAt(0) || lastWord.isEmpty()) {
//			flag = false;
		}else {flag = false;return false;}
		// 二回発言したのかを確認
		if(words.contains(word) && flag) {
//			flag = false;
		}else {flag = false; return false;}
		// 単語の最後が"z"で終わるのかを確認
		if(word.charAt(word.length()-1) != 'z' && flag) {
//			flag = false;
		}else {flag = false; return false;}
		
		return flag;
	}
}
