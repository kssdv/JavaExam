package bRank;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class exam61 {

	public static void main(String[] args) {
		Hashtable<Integer, Integer> ht = new Hashtable<>();
		List<Integer> elist = new ArrayList<>();
//		int[] lst = {10, 19, 10, 13, 12, 18, 12};
		int[] lst = {10, 12, 11};
		
		int max = 0;
		for(int i: lst) {
			if(max < i) max = i;
		}
		
		for(int j=0; j<3; j++) {
			int idx = 0;
			int min = max;
//			for(int i=0; i<lst.length; i++) {
//				if(min > lst[i] && !elist.contains(i)) {
			for(int i=lst.length-1; i>=0; i--) {
				if(min >= lst[i] && !elist.contains(i)) {
					min = lst[i];
					idx = i;
				}
			}
			elist.add(idx);
		}
		
//		System.out.printf("min1: %d, min2: %d, min3: %d\n", lst[elist.get(0)], lst[elist.get(1)], lst[elist.get(2)]);
//		System.out.printf("num1: %d, num2: %d, num3: %d\n", elist.get(0)+1, elist.get(1)+1, elist.get(2)+1);
		System.out.printf("%d\n%d\n%d\n", elist.get(0)+1, elist.get(1)+1, elist.get(2)+1);
	}
	
	static void min1to3(int[] lst) {
		List<Integer> elist = new ArrayList<>();
		int max = 0;
		for(int i: lst) {
			if(max < i) max = i;
		}
		
		for(int j=0; j<3; j++) {
			int idx = 0;
			int min = max;
			for(int i=0; i<lst.length; i++) {
				if(min > lst[i] && !elist.contains(i)) {
					min = lst[i];
					idx = i;
				}
			}
			elist.add(idx);
			System.out.printf("%d\n%d\n%d\n", elist.get(0)+1, elist.get(1)+1, elist.get(2)+1);
		}
	}
}
