package myproject01;

import java.util.Scanner;

public class exam101 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = str2int(sc.nextLine().split(" "));
		int[] lst1 = str2int(sc.nextLine().split(" "));
		int[] lst2 = str2int(sc.nextLine().split(" "));
		int max = -999999;
		
		for(int i=0; i<lst1.length; i++) {
			for(int j=0; j<lst2.length; j++) {
				int temp = lst1[i] * lst2[j];
//				temp = temp < 0 ? temp * (-1) : temp;
				if(max < temp) {
					max = temp;
				}
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
