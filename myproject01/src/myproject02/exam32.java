package myproject02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exam32 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] lst = sc.nextLine().split(" ");
//		String[] lst2 = new String[lst.length];
		List<String> lst2 = new ArrayList<>();
		
		for(int i=0; i<lst.length; i++) {
			boolean flag = true;
			for(int j=0; j<lst2.size(); j++) {
				if(lst[i].equals(lst2.get(j))) {
					flag = false;
				}
			}
			if(flag) {
				System.out.println(lst[i]);
				lst2.add(lst[i]);
			}else {
				System.out.println("already_been");
			}
		}
	}
}


