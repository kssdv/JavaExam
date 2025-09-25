package myproject02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;

public class exam64 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedHashMap<Integer, String> data = new LinkedHashMap<>();
		List<Integer> keys = new ArrayList<>();
		int n = Integer.parseInt(sc.nextLine());
		
		for(int i=0; i<n; i++) {
			String[] t = sc.nextLine().split(" ");
			data.put(Integer.parseInt(t[0]), t[1]);
			keys.add(Integer.parseInt(t[0]));
		}
		
		Collections.sort(keys);
		Collections.reverse(keys);
		
		for(int i : keys) {
			System.out.println(data.get(i));
		}
		
	}
	public static int[] str2int(String[] s) {
		int[] lst = new int[s.length];
		for(int i=0; i<s.length; i++) {
			lst[i] = Integer.parseInt(s[i]);
		}
		return lst;
	}
}
