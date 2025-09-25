package myproject03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exam05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());
		List<Integer> lst = new ArrayList<>();
		
		for(int i=0; i<num; i++) {
			int t = Integer.parseInt(sc.nextLine());
//			lst.add(t);
			if(i >= 1) {
				System.out.println(t);
			}
		}
		
	}

}
