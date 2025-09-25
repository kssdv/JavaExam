package myproject01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exam50 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		List<Integer> lst = new ArrayList<>();
		for(int i=0; i<n; i++) {
			lst.add(Integer.parseInt(sc.nextLine()));
		}
		
		for(int i=1; i<lst.size(); i++) {
			for(int j=0; j<i; j++) {
				System.out.println(lst.get(i) * lst.get(j));
			}
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
