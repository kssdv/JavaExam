package bRank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exam19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = str2int(sc.nextLine().split(" "));
		int x = num[0];
		int d = num[1];
		int q = Integer.parseInt(sc.nextLine());
		List<Integer> numbers = new ArrayList<>();
		
		numbers.add(x);
		for(int n=1; n<q; n++) {
			int t = Integer.parseInt(sc.nextLine());
			int a_n = numbers.get(n-1) + d;
			numbers.add(a_n);
//			System.out.println(a_n);
//			numbers.add(t);
		}
		numbers.forEach(i -> System.out.println(i));
	}
	public static int[] str2int(String[] str) {
		int[] lst = new int[str.length];
		for(int i=0; i<str.length; i++) {
			lst[i] = Integer.parseInt(str[i]);
		}
		return lst;
	}
}
