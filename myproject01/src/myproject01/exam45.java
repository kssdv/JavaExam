package myproject01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exam45 {
	public static void main(String[] args) {
		List<Integer> ilist = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());
		for(int i=0; i<num; i++) {
			int t = Integer.parseInt(sc.nextLine());
			if(!ilist.contains(t)) {
				ilist.add(t);
			}
		}
		System.out.println(ilist.size());
	}
	public static boolean isHere(int[] lst, int num) {
		boolean flag = false;
		for(int i=0; i>lst.length; i++) {
			if(lst[i] == num) {
				flag = true;
			}
		}
		
		return flag;
	}
	
	public static int[] str2int(String[] str) {
		int[] lst = new int[str.length];
		for(int i=0; i<str.length; i++) {
			lst[i] = Integer.parseInt(str[i]);
		}
		return lst;
	}
}
