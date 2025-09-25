package myproject02;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;
import java.util.Scanner;

public class exam34 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] lst = sc.nextLine().split(" ");
		Dictionary<String, Integer> dic = new Hashtable();
		List<Dictionary<String, Integer>> dics = new ArrayList<>();
		
		for(String s : lst) {
//			Dictionary<String, Integer> tdic = new Hashtable();
//			String temp = lst[i];
			if(dic.get(s) != null) {
				dic.put(s, dic.get(s)+1);
			}else {
				dic.put(s, 1);
			}
			
		}
		
//		Enumeration<String> keys = dic.keys();
//		while(keys.hasMoreElements()) {
//			String s = keys.nextElement();
//			System.out.println(s+" "+dic.get(s));
//		}
		
	}
}


