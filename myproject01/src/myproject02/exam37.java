package myproject02;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class exam37 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] lst = sc.nextLine().split(" ");
		LinkedHashMap<String, Integer> dic = new LinkedHashMap<>();
		
		for(int i=0; i<lst.length; i++) {
			boolean flag = false;
			for(int j=0; j<i; j++) {
				if(lst[i].equals(lst[j])) {
					flag = true;
				}
			}
			if(flag) {
				System.out.println("1");
			}else {
				System.out.println(lst[i]);
			}
		}
	}
}


