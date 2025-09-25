// マップの書き換え・縦横Java編（paizaランクB相当）
// https://paiza.jp/works/mondai/b_rank_new_level_up_problems/b_rank_new_level_up_problems__get_upsidedown/edit?language_uid=java&t=ada40a804666ccb369e6c4c005ee7c2d
package bRank;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Scanner;

class Bank {
	String name;
	String pw;
	int money;
}

public class exam08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Hashtable<String, Bank> ht = new Hashtable<>();
		List<String> keys = new ArrayList<>();
		int[] num = str2int(sc.nextLine().split(" "));
		
		for(int i=0; i<num[0]; i++) {
			String[] temp = sc.nextLine().split(" ");
			String name = temp[0];
			String pw = temp[1];
			int money = Integer.parseInt(temp[2]);
			Bank b = new Bank();
			b.name = name;
			b.pw = pw;
			b.money = money;
			keys.add(name);
			
			ht.put(name, b);
//			System.out.println(temp[0]+" "+temp[1]+" "+temp[2]);
		}
		
		for(int i=0; i<num[1]; i++) {
			String[] temp = sc.nextLine().split(" ");
			String name = temp[0];
			String pw = temp[1];
			int money = Integer.parseInt(temp[2]);
			Bank b = ht.get(name);
			if(name.equals(b.name) && pw.equals(b.pw)) {
				b.money -= money;
			}
			ht.put(name, b);
//			System.out.println(temp[0]+" "+temp[1]+" "+temp[2]);
		}
		// Get the keys using the keys() method
//        Enumeration<String> keys = ht.keys();
//
//        // Iterate through the keys
//        while (keys.hasMoreElements()) {
//        		String key = keys.nextElement();
//            System.out.println(key+" "+ht.get(key).money);
//        }
		for(String s : keys) {
			System.out.println(s+" "+ht.get(s).money);
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
