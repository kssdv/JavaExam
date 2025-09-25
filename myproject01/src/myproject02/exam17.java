package myproject02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class exam17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());
		List<Integer> lst = new ArrayList<>();
		for(int i=0; i<num; i++) {
			lst.add(Integer.parseInt(sc.nextLine()));
		}
		Collections.sort(lst);
		Collections.reverse(lst);
		
		for(int i : lst) {
			System.out.println(i);
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
