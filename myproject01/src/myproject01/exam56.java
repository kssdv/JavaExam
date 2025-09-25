package myproject01;

import java.util.Scanner;

public class exam56 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = str2int(sc.nextLine().split(" "));
		int cnt = 0;
		
		for(int i=0; i<num[0]; i++) {
			cnt += (Integer.parseInt(sc.nextLine()) > num[1] ? 1 : 0);
		}
		int res = cnt - num[2];
		System.out.println(res > 0 ? res : 0);
	}
	
	public static int[] str2int(String[] str) {
		int[] lst = new int[str.length];
		for(int i=0; i<str.length; i++) {
			lst[i] = Integer.parseInt(str[i]);
		}
		return lst;
	}
}
