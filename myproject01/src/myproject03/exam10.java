package myproject03;

import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Scanner;

public class exam10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] snum = sc.nextLine().split(" ");
		Dictionary<Integer, String> dictionary = new Hashtable<>();
		
		for(int i=0; i<Integer.parseInt(snum[0]); i++) {
			String[] temp = sc.nextLine().split(" ");
			dictionary.put(Integer.parseInt(temp[0]), temp[1]);
		}
		for(int i=0; i<Integer.parseInt(snum[1]); i++) {
			String[] temp = sc.nextLine().split(" ");
			if(temp[0].equals("join")) {
				int num = Integer.parseInt(temp[1]);
				String id = temp[2];
				dictionary.put(num, id);
			}else if(temp[0].equals("leave")) {
				int num = Integer.parseInt(temp[1]);
				dictionary.remove(num);
			}else if(temp[0].equals("call")) {
				int num = Integer.parseInt(temp[1]);
				System.out.println(dictionary.get(num));
			}
		}
	}
}
