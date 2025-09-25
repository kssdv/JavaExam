package myproject03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exam02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] num = sc.nextLine().split(" ");
//		List<String> lst = new ArrayList<>();
		List<Integer> lst = new ArrayList<>();
		
		for(int i=0; i<Integer.parseInt(num[0]); i++) {
			int temp = Integer.parseInt(sc.nextLine());
			lst.add(temp);
		}
		for(int i=0; i<Integer.parseInt(num[1]); i++) {
			int temp = Integer.parseInt(sc.nextLine());
			lst.contains(temp);
			System.out.println(lst.contains(temp) ? "YES" : "NO");
		}
	}

}
