// マップの書き換え・縦横Java編（paizaランクB相当）
// https://paiza.jp/works/mondai/b_rank_new_level_up_problems/b_rank_new_level_up_problems__get_upsidedown/edit?language_uid=java&t=ada40a804666ccb369e6c4c005ee7c2d
package bRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Hashtable;
import java.util.List;
import java.util.Scanner;
class Member2 {
	String name;
	int money = 0;
	boolean subscribe=false;
}
public class exam11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Member2> members = new ArrayList<>();
		Hashtable<String, Member2> n2m = new Hashtable<>();
		List<String> subscriber = new ArrayList<>();
		List<String> donators = new ArrayList<>();
		Hashtable<String, Integer> donatorNmoneys = new Hashtable<>();
		int num = Integer.parseInt(sc.nextLine());
		
		for(int i=0; i<num; i++) {
			String[] line = sc.nextLine().split(" ");
			String name = line[0];
			Member2 member = new Member2();
			member.name = name;
			
			if(line[1].equals("give")) {
				int money = Integer.parseInt(line[2]);
				if(n2m.contains(name)) {
					member = n2m.get(name);
				}
				if(donators.contains(name)) {
					int m = money + donatorNmoneys.get(name);
					donatorNmoneys.put(name, m);
				}else {
					donators.add(name);
					donatorNmoneys.put(name, money);
				}
				member.money += money;
			}else if(line[1].equals("join")) {
				member.subscribe = true;
				subscriber.add(name);
			}
			members.add(member);
		}
		List<Integer> moneys = new ArrayList<>();
		Hashtable<Integer, String> moneyNmembers = new Hashtable<>();
		for(String s : donators) {
			int money = donatorNmoneys.get(s);
			if(moneyNmembers.contains(money)) {
				s += " "+moneyNmembers.get(money);
			}else {
				moneys.add(money);
			}
			
			moneyNmembers.put(money, s);
		}
		Collections.sort(moneys);
		Collections.reverse(moneys);
		for(int money : moneys) {
			String temp = moneyNmembers.get(money);
			if(money > 0) {
				if(temp.split(" ").length > 1) {
					List<String> lst = Arrays.asList(temp.split(" "));
					Collections.sort(lst);
					Collections.reverse(lst);
					for(String t : lst) {
						System.out.println(t);
					}
				}else {
					System.out.println(temp);
				}
			}
		}
		Collections.sort(subscriber);
		for(String subscribe : subscriber) {
			System.out.println(subscribe);
		}
	}
	
	private static void asList(String[] lst) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	public static Member2 addMoney() {
		
		return null;
	}
	
	public static int[] str2int(String[] str) {
		int[] lst = new int[str.length];
		for(int i=0; i<str.length; i++) {
			lst[i] = Integer.parseInt(str[i]);
		}
		return lst;
	}

}
