package myproject02;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class exam36 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] lst = sc.nextLine().split(" ");
		String str = sc.nextLine();
		LinkedHashMap<String, Integer> dic = new LinkedHashMap<>();
		boolean flag = true;
		int idx = -1;
		
		for(int i=0; i<lst.length; i++) {
//			for(int j=0; j<i; j++) {
				if(flag) {
					if(lst[i].equals(str)) {
						idx = i;
						flag = false;
					}
				}
//			}
		}
		System.out.println(idx);
	}
}


