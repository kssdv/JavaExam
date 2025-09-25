package myproject01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class exam57 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		List<Integer> lst = new ArrayList<>();
		
		for(int i=0; i<n; i++) {
			lst.add(Integer.parseInt(sc.nextLine()));
		}
		Collections.sort(lst);
		int min = 999;
		int idx = -1;
		for(int i=1; i<lst.size(); i++) {
			int num1 = lst.get(i-1);
			int num2 = lst.get(i);
			int minus = Math.abs(num2 - num1);
			
			if(min > Math.abs(lst.get(i-1) - lst.get(i))) {
				idx = i;
				min = Math.abs(lst.get(i-1) - lst.get(i));
			}
		}
		System.out.println(lst.get(idx-1));
		System.out.println(lst.get(idx));
	}
	
	public static int[] str2int(String[] str) {
		int[] lst = new int[str.length];
		for(int i=0; i<str.length; i++) {
			lst[i] = Integer.parseInt(str[i]);
		}
		return lst;
	}
}
