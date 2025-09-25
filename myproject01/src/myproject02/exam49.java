package myproject02;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;
import java.util.Scanner;

public class exam49 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = str2int(sc.nextLine().split(" "));
		sc.nextLine();
		int[] tbox = str2int(sc.nextLine().split(" "));
		List<Integer> box = new ArrayList<>();
//		Dictionary dic = new Hashtable();
		
		for(int i : tbox) {
			if(i % num[0] == 0) {
				box.add(i);
			}
		}
		
		
		for(int i=0; i<num[1]; i++) {
			int temp = Integer.parseInt(sc.nextLine());
			Dictionary<Integer, Integer> dic = new Hashtable();
			int idx = -1;
			int min = 999999;
			for(int b : box) {
				dic.put(b, Math.abs(b-temp));
				if(min >= Math.abs(b-temp)) {
					min = Math.abs(b-temp);
					idx = b;
				}
			}
			System.out.println(idx);
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


