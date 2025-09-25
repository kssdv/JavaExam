package myproject01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class exam36 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int num = Integer.parseInt(sc.nextLine().split(" ")[1]);
		List<String> list_s = new ArrayList<>(Arrays.asList("1 3 5 1 2 3 6 6 5 1 4".split(" ")));
		List<Integer> list = new ArrayList<>();
		
		for(int i=0; i<list_s.size(); i++) {
			int t = Integer.parseInt(list_s.get(i));
			boolean flag = false;
			for(int j=0; j<list.size(); j++) {
				if(list.get(j) == t) {
					flag = true;
				}
			}
			if(!flag) {
				list.add(t);
			}
			
		}
		Collections.sort(list);
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
