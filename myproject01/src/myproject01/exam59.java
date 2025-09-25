package myproject01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exam59 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		List<String> lst = new ArrayList<>();
		
		for(int i=0; i<n; i++) {
			String t = sc.nextLine();
			if(t.contains("out")) {
				lst = outList(lst, t);
			}else if(t.contains("in")) {
				lst = inList(lst, t.split(" ")[1]);
			}
		}
		
		for(String s : lst) {
			System.out.println(s);
		}
		
	}
	public static List<String> outList(List<String> lst, String str) {
		if(lst.size() != 0) {
			lst.remove(0);
		}
		
		return lst;
	}
	
	public static List<String> inList(List<String> lst, String str) {
			lst.add(str);
		
		return lst;
	}
	
	public static int[] str2int(String[] str) {
		int[] lst = new int[str.length];
		for(int i=0; i<str.length; i++) {
			lst[i] = Integer.parseInt(str[i]);
		}
		return lst;
	}
}
