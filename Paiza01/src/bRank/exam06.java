// マップの書き換え・縦横Java編（paizaランクB相当）
// https://paiza.jp/works/mondai/b_rank_new_level_up_problems/b_rank_new_level_up_problems__get_upsidedown/edit?language_uid=java&t=ada40a804666ccb369e6c4c005ee7c2d
package bRank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class exam06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = str2int(sc.nextLine().split(" "));
		List<Integer> lst = new ArrayList<>();
		
		for(int i=0; i<num[0]; i++) {
			sc.nextLine();
		}
		
		for(int i=0; i<num[1]; i++) {
			String[] temp = sc.nextLine().split(" ");
			String name = temp[1];
			int year = Integer.parseInt(temp[0]);
			lst.add(year);
		}
		Collections.sort(lst);
		int t = lst.get(0);
		lst.forEach(y -> System.out.println(y));
		System.out.println("------------------");
		for(int i=1; i<lst.size(); i++) {
			if(t == lst.get(i)) {
				System.out.println(lst.get(i));
			}
			t = lst.get(i);
		}
//		lst.forEach(y -> System.out.println(y));
	}
	
	public static int[] str2int(String[] str) {
		int[] lst = new int[str.length];
		for(int i=0; i<str.length; i++) {
			lst[i] = Integer.parseInt(str[i]);
		}
		return lst;
	}

}
