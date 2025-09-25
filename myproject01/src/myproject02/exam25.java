package myproject02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;
import java.util.Scanner;

public class exam25 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Dictionary<String, Integer> damageBook = new Hashtable();
		List<String> lname = new ArrayList<>();
		int n = Integer.parseInt(sc.nextLine());
		for(int i=0; i<n; i++) {
			String tname = sc.nextLine();
			damageBook.put(tname, 0);
			lname.add(tname);
		}
		Collections.sort(lname);
		int m = Integer.parseInt(sc.nextLine());
		for(int i=0; i<m; i++) {
			String[] temp = sc.nextLine().split(" ");
			int damage = (int) damageBook.get(temp[0]);
			damage += Integer.parseInt(temp[1]);
			damageBook.put(temp[0], damage);
		}
//		String name = sc.nextLine();
//		System.out.println(damageBook.get(name));
		
		Enumeration<String> keys = damageBook.keys();
//		Collections.sort((List<String>) keys);
		for(String s : lname) {
//			String key = keys.nextElement();
//			System.out.println(s + ": "+ damageBook.get(s));
			System.out.println(damageBook.get(s));
		}
	}
	
	public static int[] str2int(String[] slst) {
		int[] lst = new int[slst.length];
		for(int i=0; i<slst.length; i++) {
			lst[i] = Integer.parseInt(slst[i]);
		}
		
		return lst;
	}
}


