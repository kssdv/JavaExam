package myproject02;

import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Scanner;

public class exam24 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Dictionary damageBook = new Hashtable();
		damageBook.put("A", 1);
		
		System.out.println(damageBook.get("A"));
		
		damageBook.put("A", 2);
		damageBook.put("B", 2);
		
		System.out.println(damageBook.get("A"));
		System.out.println(damageBook.size());
	}
	
	public static int[] str2int(String[] slst) {
		int[] lst = new int[slst.length];
		for(int i=0; i<slst.length; i++) {
			lst[i] = Integer.parseInt(slst[i]);
		}
		
		return lst;
	}
}


