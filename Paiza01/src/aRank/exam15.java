package aRank;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Scanner;

public class exam15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Hashtable<Character, Character> win = new Hashtable<>();
		Hashtable<Character, Integer> finger = new Hashtable<>();
		int[] num = str2int(sc.nextLine().split(" "));
		char[] gcp = sc.nextLine().toCharArray();
		List<Integer> tmp = new ArrayList<>();
		
		// 勝つ手
		win.put('G', 'P');
		win.put('P', 'C');
		win.put('C', 'G'); 
		// 指の数
		finger.put('G', 0);
		finger.put('P', 5);
		finger.put('C', 2);
		
	}
	private static int[] str2int(String[] str) {
		int[] lst = new int[str.length];
		for(int i=0; i<str.length; i++) {
			lst[i] = Integer.parseInt(str[i]);
		}
		return lst;
	}
}
