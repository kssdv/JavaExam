package myproject01;

import java.util.Scanner;

public class exam71 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		sc.nextLine();
		int[] lst = str2int(sc.nextLine().split(" "));
		for(int i=0; i<lst.length; i++) {
			if(lst[i] % 2 == 0) {
				sum += lst[i];
			}else {
				break;
			}
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
