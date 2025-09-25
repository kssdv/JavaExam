package bRank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exam47 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> lst = new ArrayList<>();
		lst.add(1);
		lst.add(2);
//		lst.add(3);
		int n = 4;
		printTimes(lst, n);
//		System.out.println();
	}
	
	public static void printTimes(List<Integer> lst, int n) {
		int cnt = 0;
		int idx = 0;
		while(cnt < n) {
			System.out.println(lst.get(idx));
			idx = lst.size() <= idx + 1 ? idx + 1 - lst.size() : idx + 1;
			if(lst.get(idx) == -1) {
				
			}
			cnt++;
		}
	}
	
//	public static int aaa(List<Integer> lst, int idx) {
//		
//	}
}
