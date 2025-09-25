package myproject02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exam33 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] lst = sc.nextLine().split(" ");
		List<String> temp = new ArrayList<>();
		List<Integer> cnt = new ArrayList<>();
		
		for(int i=0; i<lst.length; i++) {
			boolean flag = true; 
			for(int j=0; j<temp.size(); j++) {
				if(lst[i].equals(temp.get(j))) {
					flag = false;
				}
			}
			if(flag) {
				temp.add(lst[i]);
			}else {
				
			}
		}
		
	}
}


