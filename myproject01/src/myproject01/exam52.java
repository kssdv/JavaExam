package myproject01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exam52 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		List<Integer> lst = new ArrayList<>();
		for(int i=0; i<n; i++) {
			int t = Integer.parseInt(sc.nextLine());
			if(!lst.contains(t)) {
				lst.add(t);
			}
		}
		
		for(int i : lst) {
			System.out.println(i);
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
