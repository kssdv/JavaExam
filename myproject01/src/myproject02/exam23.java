package myproject02;

import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Scanner;

public class exam23 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Dictionary damageBook = new Hashtable();
		int n = Integer.parseInt(sc.nextLine());
		for(int i=0; i<n; i++) {
			String tname = sc.nextLine();
			damageBook.put(tname, 0);
		}
		
		int m = Integer.parseInt(sc.nextLine());
		for(int i=0; i<m; i++) {
			String[] temp = sc.nextLine().split(" ");
			int damage = (int) damageBook.get(temp[0]);
			damage += Integer.parseInt(temp[1]);
			damageBook.put(temp[0], damage);
		}
		String name = sc.nextLine();
		System.out.println(damageBook.get(name));
	}
	
	public static int[] str2int(String[] slst) {
		int[] lst = new int[slst.length];
		for(int i=0; i<slst.length; i++) {
			lst[i] = Integer.parseInt(slst[i]);
		}
		
		return lst;
	}
}


