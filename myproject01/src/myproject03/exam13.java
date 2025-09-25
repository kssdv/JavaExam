package myproject03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class exam13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> lst = new ArrayList<>();
		String[] num = sc.nextLine().split(" ");
		
		for(int i=0; i<Integer.parseInt(num[0]); i++) {
			String name = sc.nextLine();
			lst.add(name);
		}
		for(int i=0; i<Integer.parseInt(num[1]); i++) {
			String e = sc.nextLine();
			if(e.contains("join")) {
				lst.add(e.split(" ")[1]);
			}else if(e.contains("leave")) {
				for(int j=0; j<lst.size(); j++) {
					if(lst.get(j).equals(e.split(" ")[1])) 
						lst.remove(j);
				}
			}else if(e.contains("handshake")) {
				if(lst.size() > 0) {
					Collections.sort(lst);
					for(int j=0; j<lst.size(); j++) {
						System.out.println(lst.get(j));
					}
				}
			}
		}
		
	}
}
