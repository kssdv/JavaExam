package myproject03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exam03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] num = sc.nextLine().split(" ");
		List<String> lst = new ArrayList<>();
		boolean flag = false;
		for(int i=0; i<Integer.parseInt(num[0]); i++) {
			String temp = sc.nextLine();
			if(temp.equals(num[1])) {
				flag = true;
			}
		}
		System.out.println(flag ? "YES" : "NO");
	}

}
