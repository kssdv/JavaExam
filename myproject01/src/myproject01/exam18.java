package myproject01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exam18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] line = sc.nextLine().split(" ");
		int num1 = Integer.parseInt(line[0]);
		int num2 = Integer.parseInt(line[1]);
		List<String> lst1 = new ArrayList<>();
		List<String> lst2 = new ArrayList<>();
		for(int i=0; i<num1; i++) {
			lst1.add(sc.nextLine());
		}
		for(int i=0; i<num2; i++) {
			lst2.add(sc.nextLine());
		}
//		boolean flag = true;
		int record = 999;
		int cnt = 0;
//		System.out.println(line[1]);
//		for(int i=0; i<lst1.size(); i++) {
//			for(int j=0; j<lst2.size(); j++) {
////				if(lst1.get(i).equals(lst2.get(Integer.parseInt(line[1])-1)) && flag) {
//				if(lst1.get(i).equals(lst2.get(j)) && record > i && cnt < 2) {
////					System.out.println(i+1);
//					flag = false;
//					record = i;
//					cnt++;
//					break;
//				}
//			}
//		}
		boolean flag2 = true;
		List<Boolean> flags = new ArrayList<>();
		for(int i=0; i<num2; i++) {
			flags.add(true);
		}
		for(int i=0; i<lst2.size(); i++) {
			flag2 = true;
			if(flags.size() < i+1) {
				flags.add(true);
			}
			for(int j=0; j<lst1.size(); j++) {
				if(cnt < lst2.size()) {
					if(record > j) {
						record = j;
					}
//					cnt++;
					flag2 = false;
					flags.set(i, false);
				}
			}
		}
		System.out.println(num2);
		if(flag2) {
			System.out.println(-1);
		}else {
			System.out.println(record+1);
		}
		
	}
}
