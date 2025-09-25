package myproject02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exam60 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] tags = sc.nextLine().split(" ");
		String str = sc.nextLine();
		List<Integer> res = new ArrayList<>();
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == '<') {
				res.add(i+1);
			}
		}
		for(int i=2; i<=res.size(); i=i+2) {
			System.out.println(res.get(i-2)+" "+res.get(i-1));
		}
//		System.out.println(res.get(0)+ " " + res.get(1));
	}
}
