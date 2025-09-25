package bRank;

import java.util.Hashtable;
import java.util.Scanner;

public class exam75 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Hashtable<String, Integer> registors = new Hashtable<>();
		double res = 0;
		
		int n = Integer.parseInt(sc.nextLine());
		for(int i=0; i<n; i++) {
			String[] tmp = sc.nextLine().split(" ");
			registors.put(tmp[0], Integer.parseInt(tmp[1]));
		}
		String m = sc.nextLine();
		String[] ms = sc.nextLine().split(" ");
		
		for(String s : ms) {
			if(s.length() > 1) {
				String[] t = s.split("");
				double tint = 0;
				for(String s1 : t) {
					tint += (double) 1.0/registors.get(s1);
				}
				res += 1/tint;
				
			}else {
				res += registors.get(s);
			}
		}
		System.out.println((int) res);
	}
	
	static int[] str2int(String[] str) {
		int[] lst = new int[str.length];
		for(int i=0; i<str.length; i++) {
			lst[i] = Integer.parseInt(str[i]);
		}
		return lst;
	}
}
