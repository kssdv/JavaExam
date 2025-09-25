// マップの書き換え・縦横Java編（paizaランクB相当）
// https://paiza.jp/works/mondai/b_rank_new_level_up_problems/b_rank_new_level_up_problems__get_upsidedown/edit?language_uid=java&t=ada40a804666ccb369e6c4c005ee7c2d
package bRank;

import java.util.Hashtable;
import java.util.Scanner;
import java.util.TreeMap;

public class exam03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Hashtable<Integer, String> hashtable = new Hashtable();
		int[] num = str2int(sc.nextLine().split(" "));
		String[] names = new String[num[0]];
		
		for(int i=0; i<num[0]; i++) {
			names[i] = sc.nextLine();
		}
		
		for(int i=0; i<num[1]; i++) {
			String[] temp = sc.nextLine().split(" ");
			int year = Integer.parseInt(temp[0]);
			String name = temp[1];
			hashtable.put(year, name);
		}
		
		// TreeMapに変換してキーをソート
		TreeMap<Integer, String> sortedMap = new TreeMap<>(hashtable);
		// ソートした結果を表示
		sortedMap.forEach((key, value) -> System.out.println(key+ ": "+value));
//		sortedMap.forEach((key, value) -> System.out.println(value));
	}
	
	public static int[] str2int(String[] str) {
		int[] lst = new int[str.length];
		for(int i=0; i<str.length; i++) {
			lst[i] = Integer.parseInt(str[i]);
		}
		return lst;
	}

}
