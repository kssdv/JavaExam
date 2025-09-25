// マップの書き換え・縦横Java編（paizaランクB相当）
// https://paiza.jp/works/mondai/b_rank_new_level_up_problems/b_rank_new_level_up_problems__get_upsidedown/edit?language_uid=java&t=ada40a804666ccb369e6c4c005ee7c2d
package bRank;

import java.util.Hashtable;
import java.util.Scanner;
import java.util.TreeMap;

public class exam04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Hashtable<String, String> hashtable = new Hashtable<>();
		
		for(int i=0; i<5; i++) {
			String temp = sc.nextLine();
			hashtable.put(temp, "");
		}
		
		TreeMap<String, String> treemap = new TreeMap<>(hashtable);
		
		treemap.forEach((key, value) -> System.out.println(key+", "+value));
		
	}
	
	public static int[] str2int(String[] str) {
		int[] lst = new int[str.length];
		for(int i=0; i<str.length; i++) {
			lst[i] = Integer.parseInt(str[i]);
		}
		return lst;
	}

}
