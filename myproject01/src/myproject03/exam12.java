package myproject03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class exam12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> lst = new ArrayList<>();
		String[] num = sc.nextLine().split(" ");
		int p = Integer.parseInt(num[2]); // Paiza本人
		lst.add(p);
		
		for(int i=0; i<Integer.parseInt(num[0]); i++) {
			int h = Integer.parseInt(sc.nextLine());
			lst.add(h);
		}
		for(int i=0; i<Integer.parseInt(num[1]); i++) {
			String[] event = sc.nextLine().split(" ");
			if(event[0].equals("join")) {
				lst.add(Integer.parseInt(event[1]));
			}else if(event[0].equals("sorting")) {
				Collections.sort(lst);
				for(int j=0; j<lst.size(); j++) {
					if(lst.get(j) == p) System.out.println(j+1);
				}
			}
		}
		
		
	}
}
