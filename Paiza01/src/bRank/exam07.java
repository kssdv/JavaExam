// マップの書き換え・縦横Java編（paizaランクB相当）
// https://paiza.jp/works/mondai/b_rank_new_level_up_problems/b_rank_new_level_up_problems__get_upsidedown/edit?language_uid=java&t=ada40a804666ccb369e6c4c005ee7c2d
package bRank;

import java.util.Arrays;
import java.util.Collections;
import java.util.Hashtable;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

public class exam07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = str2int(sc.nextLine().split(" "));
		Hashtable<Integer, String> ht = new Hashtable<>();
		
		
		for(int i=0; i<num[0]; i++) {
			String name = sc.nextLine();
		}
		
		for(int i=0; i<num[1]; i++) {
			String[] t = sc.nextLine().split(" ");
			int year = Integer.parseInt(t[0]);
			String name = t[1];
			if(ht.containsKey(year)) {
				name += " "+ht.get(year);
				List<String> lst = Arrays.asList(name.split(" "));
				Collections.sort(lst);
				name = String.join(" ", lst);
			}
			ht.put(year, name);
		}
		
		TreeMap<Integer, String> tm = new TreeMap<>(ht);
		
		tm.forEach((key, value) -> {
			System.out.print("year: "+key+", value: ");
			if(value.split(" ").length > 1) {
				String[] t = value.split(" ");
				for(String s : t) {
					System.out.println(s);
				}
			}else {
				System.out.println(value);
			}
		});
		
	}
	
	public static int[] str2int(String[] str) {
		int[] lst = new int[str.length];
		for(int i=0; i<str.length; i++) {
			lst[i] = Integer.parseInt(str[i]);
		}
		return lst;
	}

}
