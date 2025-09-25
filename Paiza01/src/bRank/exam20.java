package bRank;

import java.util.Scanner;

public class exam20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = str2int(sc.nextLine().split(" "));
		int q = Integer.parseInt(sc.nextLine());
		int[] numbers = new int[q+1];
		
		for(int i=0; i<q; i++) {
//			numbers[i] = i <= 0 ? num[0] : (numbers[i-1] + num[1]);
//			System.out.println(numbers[i]);
//			System.out.println(i <= 0 ? num[0] : (numbers[i-1] + num[1]));
			int t = Integer.parseInt(sc.nextLine())-1;
			System.out.println(t <= 0 ? num[0] : num[0] + num[1]*t);
		}
	}
	public static int[] str2int(String[] str) {
		int[] lst = new int[str.length];
		for(int i=0; i<str.length; i++) {
			lst[i] = Integer.parseInt(str[i]);
		}
		return lst;
	}
}
