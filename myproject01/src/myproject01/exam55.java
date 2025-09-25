package myproject01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exam55 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> lst = new ArrayList<>();
		int n = Integer.parseInt(sc.nextLine());
		int[] omomi = str2int(sc.nextLine().split(" "));
		int max = 0;
		
		for(int i=0; i<n; i++) {
			int[] score = str2int(sc.nextLine().split(" "));
			int cnt = 0;
			for(int j=0; j<score.length; j++) {
				cnt += omomi[j] * score[j];
			}
			if(max < cnt) {
				max = cnt;
			}
		}
		System.out.println(max);
	}
	
	public static int[] str2int(String[] str) {
		int[] lst = new int[str.length];
		for(int i=0; i<str.length; i++) {
			lst[i] = Integer.parseInt(str[i]);
		}
		return lst;
	}
}
