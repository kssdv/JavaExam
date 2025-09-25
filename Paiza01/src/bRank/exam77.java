package bRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class exam77 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] nm = str2int(sc.nextLine().split(" "));
		List<Integer> revenues = new ArrayList<>();
		int res = 0;
		boolean isRed = true;
		
		if(nm[0] > 0) {
			for(int i=0; i<nm[1]; i++) {
				int[] tmp = str2int(sc.nextLine().split(" "));
				int sum = Arrays.stream(tmp).sum();
				revenues.add(sum);
			}
			
			Collections.sort(revenues);
			
			for(int i : revenues) {
				if(i > 0) {
					res += i;
				}
			}
			
			System.out.println(res);
		}else {
			System.out.println(0);
		}
		
	}
	
	static int[] str2int(String[] str) {
		int[] lst = new int[str.length];
		for(int i=0; i<str.length; i++) {
			lst[i] = Integer.parseInt(str[i]);
		}
		return lst;
	}
}
