package myproject03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exam01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] num = sc.nextLine().split(" ");
		List<String> lst = new ArrayList<>();
		
		for(int i=0; i<Integer.parseInt(num[0]); i++) {
			String temp = sc.nextLine();
			lst.add(temp);
		}
		lst.add(Integer.parseInt(num[1]), num[2]);
		
		for(String s: lst) {
			System.out.println(s);
		}
	}

}
