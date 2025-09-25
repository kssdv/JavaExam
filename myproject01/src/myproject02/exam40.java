package myproject02;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class exam40 {
	public static void main(String[] args) {
		LinkedHashMap<String, String> dic = new LinkedHashMap<>();
		Scanner sc = new Scanner(System.in);
		String first = sc.nextLine();
		int num = Integer.parseInt(sc.nextLine());
		String[] lst = new String[num];
		for(int i=0; i<num; i++) {
			String t = sc.nextLine();
			if(first.equals(t)) {
				dic.put(t, "first");
			}else {
				int cnt = 0;
				for(int j=0; j<t.length(); j++) {
					if(first.charAt(i) == t.charAt(i)) cnt++;
				}
			}
			
			lst[i] = t;
		}
		
		
		// 6digit
		
	}
	
}


