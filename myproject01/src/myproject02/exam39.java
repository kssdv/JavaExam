package myproject02;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class exam39 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] lst = sc.nextLine().split(" ");
		LinkedHashMap<String, Integer> dic = new LinkedHashMap<>();
		
		for(String s : lst) {
			if(dic.get(s) == null) {
				dic.put(s, 1);
			}else {
				dic.put(s, dic.get(s)+1);
			}
		}
		
		for(Map.Entry<String, Integer> entry : dic.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}
}


