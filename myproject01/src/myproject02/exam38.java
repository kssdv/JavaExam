package myproject02;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class exam38 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] lst = sc.nextLine().split(" ");
		LinkedHashMap<String, Integer> dic = new LinkedHashMap<>();
		
		for(int i=0; i<lst.length; i++) {
			if(dic.get(lst[i]) == null) {
				dic.put(lst[i], 1);
			}else {
				dic.put(lst[i], dic.get(lst[i])+1);
			}
		}
		for(Map.Entry<String, Integer> entry : dic.entrySet()) {
			System.out.println(entry.getKey());
		}
		for(Map.Entry<String, Integer> entry : dic.entrySet()) {
			System.out.println(dic.get(entry.getKey()));
		}
	}
}


