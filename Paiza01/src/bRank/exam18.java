package bRank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exam18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = str2int(sc.nextLine().split(" "));
		int x = num[0];
		int d = num[1];
		int k = num[2];
		List<Integer> numbers = new ArrayList<>();
		numbers.add(x);
		
		
		for(int i=1; i<k; i++) {
			numbers.add(i, numbers.get(i-1) + d);
		}
		int sum = 0;
		for(int i=0; i<numbers.size(); i++) {
			sum = numbers.get(i);
		}
		System.out.println(sum);
	}
	public static int[] str2int(String[] str) {
		int[] lst = new int[str.length];
		for(int i=0; i<str.length; i++) {
			lst[i] = Integer.parseInt(str[i]);
		}
		return lst;
	}
}
