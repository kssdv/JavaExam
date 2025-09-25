package bRank;

import java.util.Scanner;

public class exam21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = str2int(sc.nextLine().split(" "));
		int x = num[0];
		int d1 = num[1];
		int d2 = num[2];
		int k = num[3];
		
		if(k <= 1){
			System.out.println(x);
		}else if (k % 2 == 0){
			System.out.println(x + (d1 + d2)*((k-1)/2) + d2);
		}else if(k % 2 != 0){
			System.out.println(x + (d1 + d2)*((k-1)/2));
		}
		
	}
	
	public static int cal(int k) {
		int res=0;
		
		
		return res;
	}
	public static int[] str2int(String[] str) {
		int[] lst = new int[str.length];
		for(int i=0; i<str.length; i++) {
			lst[i] = Integer.parseInt(str[i]);
		}
		return lst;
	}
}
