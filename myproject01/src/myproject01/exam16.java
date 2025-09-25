//5
//bcd
//abc
//bcd
//bcd
//bcd
package myproject01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class exam16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> lst = new ArrayList<>();
		int num = Integer.parseInt(sc.nextLine());
		for(int i=0; i<num; i++) {
			lst.add(sc.nextLine());
		}
		// 被らないStringのList
		List<String> origin = new ArrayList<>();
		List<Integer> cnt = new ArrayList<>();
		origin.add(lst.get(0));
		cnt.add(0);
		
		for(int i=0; i<lst.size(); i++) {
			boolean flag = true;
			for(int j=0; j<origin.size(); j++) {
//				if(origin.get(j).equals(lst.get(i))) {
				if(lst.get(i).equals(origin.get(j))) {
					flag = false;
				}
			}
			if(flag) {
				origin.add(lst.get(i));
				cnt.add(0);
			}
		}
		Collections.sort(origin);
//		System.out.println(origin.toString());
//		System.out.println(cnt.toString());
		
		for(int i=0; i<origin.size(); i++) {
			for(int j=0; j<lst.size(); j++) {
				if(origin.get(i).equals(lst.get(j))) {
					cnt.set(i, cnt.get(i)+1);
				}
			}
		}
		for(int i=0; i<origin.size(); i++) {
			System.out.println(origin.get(i)+" "+cnt.get(i));
		}
	}
}
