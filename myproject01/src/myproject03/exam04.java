package myproject03;

import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class exam04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] num = sc.nextLine().split(" ");
//		List<String> lst = new ArrayList<>();
//		List<Integer> lst = new ArrayList<>();
		Dictionary<String, Boolean> dictionary = new Hashtable();
		
		for(int i=0; i<Integer.parseInt(num[0]); i++) {
//			int temp = Integer.parseInt(sc.nextLine());
			String temp = sc.nextLine();
//			lst.add(temp);
			dictionary.put(temp, true);
		}
		for(int i=0; i<Integer.parseInt(num[1]); i++) {
//			int temp = Integer.parseInt(sc.nextLine());
			String temp = sc.nextLine();
//			lst.contains(temp);
			System.out.println(((Map) dictionary).containsKey(temp) ? "YES" : "NO");
		}
	}

}
