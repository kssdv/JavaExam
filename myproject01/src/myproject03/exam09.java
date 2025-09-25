package myproject03;

import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Scanner;

public class exam09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] snum = sc.nextLine().split(" ");
		Dictionary<Integer, String> dictionary = new Hashtable<>();
		
		for(int i=0; i<Integer.parseInt(snum[0]); i++) {
			String[] temp = sc.nextLine().split(" ");
			dictionary.put(Integer.parseInt(temp[0]), temp[1]);
		}
		for(int i=0; i<Integer.parseInt(snum[1]); i++) {
			int t = Integer.parseInt(sc.nextLine());
			System.out.println(dictionary.get(t));
		}
	}
}
