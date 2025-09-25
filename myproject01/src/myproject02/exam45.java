package myproject02;

import java.util.Scanner;

public class exam45 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = str2int(sc.nextLine().split(" "));
		int n = num[0];
		
		for(int i=0; i<num[1]; i++) {
			int temp = Integer.parseInt(sc.nextLine());
			int min = (temp / n) * n;
			int max = (temp / n + 1) * n;
			if(temp / n <= 0) {
				System.out.println(n);
			}else if((max - temp) <= (temp - min)) {
				System.out.println(max);
			}else {
				System.out.println(min);
			}
		}
	}
	
//	public static int how
	
	public static int[] str2int(String[] s) {
		int[] lst = new int[s.length];
		for(int i=0; i<s.length; i++) {
			lst[i] = Integer.parseInt(s[i]);
		}
		
		return lst;
	}
}


