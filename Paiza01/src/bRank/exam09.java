// マップの書き換え・縦横Java編（paizaランクB相当）
// https://paiza.jp/works/mondai/b_rank_new_level_up_problems/b_rank_new_level_up_problems__get_upsidedown/edit?language_uid=java&t=ada40a804666ccb369e6c4c005ee7c2d
package bRank;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Scanner;

class Busyo {
	String name;
	String num;
	int money;
}

public class exam09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = str2int(sc.nextLine().split(" "));
		List<String> names = new ArrayList<>();
		List<String> buys = new ArrayList<>();
		Hashtable<String, List<String>> ht = new Hashtable<>();
		
		for(int i=0; i<num[0]; i++) {
			String name = sc.nextLine();
			names.add(name);
		}
		for(int i=0; i<num[1]; i++) {
			List<String> temp = new ArrayList<>();
			String[] line = sc.nextLine().split(" ");
			if(ht.containsKey(line[0])) {
				temp = ht.get(line[0]);
			}
			temp.add(line[1]+" "+line[2]);
			ht.put(line[0], temp);
		}
		for(String s : names) {
			System.out.println(s);
			if(ht.containsKey(s)) {
				for(String t : ht.get(s)) {
					System.out.println(t);
				}
			}
			
			System.out.println("-----");
		}
	}
	
	public static int[] str2int(String[] str) {
		int[] lst = new int[str.length];
		for(int i=0; i<str.length; i++) {
			lst[i] = Integer.parseInt(str[i]);
		}
		return lst;
	}

}
