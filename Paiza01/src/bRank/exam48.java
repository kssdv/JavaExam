package bRank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exam48 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> lst = new ArrayList<>();
		List<String> dictionary = new ArrayList<>();
		List<String> words = new ArrayList<>();
		List<Integer> idx = new ArrayList<>();
		String[] nkm = sc.nextLine().split(" ");
		String lword = "";
		int n = Integer.parseInt(nkm[0]);
		int k = Integer.parseInt(nkm[1]);
		int m = Integer.parseInt(nkm[2]);
		int times = m;
		
		for(int i=0; i<k; i++) {
			String word = sc.nextLine();
			dictionary.add(word);
		}
		
		for(int i=0; i<n; i++) {
			lst.add(i+1);
		}
		
		while(times > 0) {
			boolean flag = false;
//			List<Integer> idx = new ArrayList<>();
			
			for(int i=0; i<lst.size(); i++) {
				if(times < 1) {
					break;
				}
				
				String word = sc.nextLine();
				// しりとりのルールを破ったとしたら
				 if(isCorrect(word, lword, dictionary, words)) {
					 words.add(word);
//					 lword = word;
					 System.out.println("("+lst.get(i)+") "+ word + " is correct!!!");
				 }else {
					 System.out.println(word+" is not correct!");
					 word = "";
//					 flag = true;
					 idx.add(i);
				 }
				 lword = word;
//				 words.add(word);
//				 lword = word;
				 times--;
			 }
			// delete idx of list
//			if(flag) lst.remove(i);
			System.out.println("idx : " + idx.toString());
			if(idx.size() > 0) {
				for(int i : idx) {
					lst.remove(i);
				}
			}
//			times--;
		}
		
//		printTimes(lst, n);
		for(int i: lst) {
			System.out.println(i);
		}
		
	}
	
	public static void printTimes(List<Integer> lst, int n) {
		int cnt = 0;
		int idx = 0;
		while(cnt < n) {
			System.out.println(lst.get(idx));
			idx = lst.size() <= idx + 1 ? idx + 1 - lst.size() : idx + 1;
			if(lst.get(idx) == -1) {
				
			}
			cnt++;
		}
	}
	
	public static boolean isCorrect(String word, String lastWord, List<String> dictionary, List<String> words) {
		// 停止した単語が単語リストにあるかを確認
		if(!dictionary.contains(word)) {
			return false;
		}
		// 以前単語の最後文字と現在単語の最初が一致するのかを比較
		if(lastWord.isEmpty()) {
		}else if(lastWord.charAt(lastWord.length()-1) == word.charAt(0)) {
		}else {
			return false;
		}
		// 二回発言したのかを確認
		if(words.contains(word)) {
			return false;
		}
		// 単語の最後が"z"で終わるのかを確認
		if(word.charAt(word.length()-1) == 'z') {
			return false;
		}
		
		return true;
	}
}
