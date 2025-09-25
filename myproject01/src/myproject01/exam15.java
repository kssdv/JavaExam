package myproject01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exam15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num = sc.nextLine();
		String line = sc.nextLine();
		List<String> alphabet = new ArrayList<>();
		int[] cnt = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		char c = (char) 96;
		for(int i=1; i<=26; i++) {
			c = (char) (c + 1);
			alphabet.add(Character.toString(c));
		}
		for(int i=0; i<line.length(); i++) {
			for(int j=0; j<alphabet.size(); j++) {
				if((line.charAt(i)+"").equals(alphabet.get(j))) {
					cnt[j]++;
				}
			}
		}
		for(int i=0; i<cnt.length; i++) {
			if(i == 0) {
				System.out.print(cnt[i]);
			}else {
				System.out.print(" "+cnt[i]);
			}
		}
		
	}
}
