package bRank;

import java.util.Hashtable;
import java.util.Scanner;

public class exam44 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Hashtable<String, String> hashtable = new Hashtable<>();
		hashtable.put("LLLRB", "rolling");
		hashtable.put("DDRRA", "upper");
		hashtable.put("AAAAA", "rush");
		String str = sc.nextLine();
		
		for(int i=0; i<=str.length()-5; i++) {
			String tstr = str.substring(i, i+5);
			if(hashtable.get(tstr) != null) {
				System.out.println(hashtable.get(tstr));
				i = i + 4;
				tstr = "";
			}
		}
		
	}
}
