package bRank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.List;
import java.util.Scanner;

public class exam76 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Hashtable<String, String> dictionary = new Hashtable<>();
		List<String> registors = new ArrayList<>();
		int n = Integer.parseInt(sc.nextLine());
		for(int i=0; i<n; i++) {
			String[] tmp = sc.nextLine().split(" ");
			dictionary.put(tmp[0], tmp[1]);
			registors.add(tmp[0]);
		}
		Collections.sort(registors);
		
		for(String s : registors) {
			System.out.println(dictionary.get(s));
		}
		
	}
	
	static int[] str2int(String[] str) {
		int[] lst = new int[str.length];
		for(int i=0; i<str.length; i++) {
			lst[i] = Integer.parseInt(str[i]);
		}
		return lst;
	}
}
