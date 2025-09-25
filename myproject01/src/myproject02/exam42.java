/*
142358
3
195283
167358
142359
 */

package myproject02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exam42 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String first = sc.nextLine();
		int n = Integer.parseInt(sc.nextLine());
		List<String> lst = new ArrayList<>();
		List<String> adjacent = new ArrayList<>();
		List<String> second = new ArrayList<>();
		List<String> third = new ArrayList<>();
		adjacent.add(Integer.parseInt(first)-1+"");
		adjacent.add(Integer.parseInt(first)+1+"");
			
		
		int cnt = 0;
		// 二等になる数をlstに追加
		for(int i=0; i<=9; i++) {
			String temp = (10+i)+first.substring(2);
			if(!first.equals(temp)) {
				second.add(temp);
			}
		}
		
//		while(third.size() >= 90) {
//			String temp = (100 + cnt)+first.substring(3);
//			if(!first.equals(temp)) {
//				third.add(temp);
//			}
//			cnt++;
//		}
		// ３ン党になる数をthirdに追加
		for(int i=0; i<100; i++) {
			String temp = (100 + i)+first.substring(3);
			if(!first.equals(temp) && !second.contains(temp)) {
				third.add(temp);
			}
		}
		
//		System.out.println("secondの個数："+second.size());
//		System.out.println("thirdの個数："+third.size());
//		System.out.println("secondにある数なのか？"+second.contains("102358"));
		
		for(int i=0; i<n; i++) {
			String s = sc.nextLine();
			if(first.equals(s)){
				System.out.println("first");
			}else if(adjacent.contains(s)) {
				System.out.println("adjacent");
			}else if(second.contains(s)) {
				System.out.println("second");
			}else if(third.contains(s)) {
				System.out.println("third");
			}else {
				System.out.println("blank");
			}
		}
	}
	
	public static int[] str2int(String[] s) {
		int[] lst = new int[s.length];
		for(int i=0; i<s.length; i++) {
			lst[i] = Integer.parseInt(s[i]);
		}
		return lst;
	}
}


