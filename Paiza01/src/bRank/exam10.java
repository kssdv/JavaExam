// マップの書き換え・縦横Java編（paizaランクB相当）
// https://paiza.jp/works/mondai/b_rank_new_level_up_problems/b_rank_new_level_up_problems__get_upsidedown/edit?language_uid=java&t=ada40a804666ccb369e6c4c005ee7c2d
package bRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;
import java.util.Scanner;
class Member {
	String name;
	int money = 0;
	boolean subscribe=false;
}
public class exam10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());
		List<Member> members = new ArrayList<>();
		Hashtable<String, Member> ht = new Hashtable<>();
//		List<Integer> moneys = new ArrayList<>();
		
		for(int i=0; i<num; i++) {
			String line = sc.nextLine();
			Member m = new Member();
			String name = line.split(" ")[0];
			if(ht.contains(name)) {
				m = ht.get(name);
			}
			
			if(line.contains("give")) {
				String[] t = line.split(" ");
				m.name = t[0];
				m.money += Integer.parseInt(t[2]);
			}else if(line.contains("membership")) {
				m.subscribe = true;
			}
			ht.put(name, m);
		}
		// スーパーチャット金額順にソート
		// <money, name>
		Hashtable<Integer, String> supaName = new Hashtable<>();
		
		Enumeration<String> keys = ht.keys();
		int tmoney = 0;
		while(keys.hasMoreElements()) {
			String name = keys.nextElement();
			int money1 = ht.get(name).money;
			if(supaName.containsKey(money1)) {
				name = name+" "+supaName.get(money1);
				List<String> t = Arrays.asList(name.split(" "));
				Collections.sort(t);
				Collections.reverse(t);
				name = String.join(" ", t);
			}
//			moneys.add(money1);
			supaName.put(money1, name);
		}
		// print supa
		List<Integer> imoneys = new ArrayList<>();
		Enumeration<Integer> moneys = supaName.keys();
		while(moneys.hasMoreElements()) {
			int i = moneys.nextElement();
			imoneys.add(i);
		}
		Collections.sort(imoneys);
		Collections.reverse(imoneys);
		imoneys.forEach(i -> {
			if(i > 0) {
				String names = supaName.get(i); 
				for(String s : names.split(" ")) {
					System.out.println(s);
				}
			}
		});
		
		// print subscriber
		List<String> subscriber = new ArrayList<>();
		Enumeration<String> keys2 = ht.keys();
		while(keys2.hasMoreElements()) {
			String name = keys2.nextElement();
			if(ht.get(name).subscribe) {
				subscriber.add(name);
			}
		}
		Collections.sort(subscriber);
		subscriber.forEach(s -> System.out.println(s));
	}
	
	public static int[] str2int(String[] str) {
		int[] lst = new int[str.length];
		for(int i=0; i<str.length; i++) {
			lst[i] = Integer.parseInt(str[i]);
		}
		return lst;
	}

}
