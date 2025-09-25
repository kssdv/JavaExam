package myproject01;

import java.util.Scanner;

public class emax71 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());
		int[] lst1 = str2int(sc.nextLine().split(" "));
		int[] lst2 = str2int(sc.nextLine().split(" "));
		int cnt = 0;
		
		for(int i=0; i<lst1.length; i++) {
			if(lst1[i] == lst2[i]) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
	public static int[] str2int(String[] str) {
		int[] lst = new int[str.length];
		for(int i=0; i<str.length; i++) {
			lst[i] = Integer.parseInt(str[i]);
		}
		return lst;
	}
}
