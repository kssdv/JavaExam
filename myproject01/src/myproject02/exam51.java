package myproject02;

import java.util.Scanner;

// max 1500
public class exam51 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = str2int(sc.nextLine().split(" "));
		int n = num[0];
		
		for(int i=0; i<num[1]; i++) {
			int temp = Integer.parseInt(sc.nextLine());
			int min = n * (temp / n);
			int max = n * (temp / n + 1);
			
			if(temp / n <= 0) {
				System.out.println(n);
			}else if(Math.abs(max-temp) <= Math.abs(temp - min)) {
				System.out.println(max);
			}else {
				System.out.println(min);
			}
		}
	}
	public static int[] str2int(String[] s) {
		int[] lst = new int[s.length];
		for(int i=0; i<s.length; i++) {
			lst[i] = Integer.parseInt(s[i]);
		}
		return lst;
	}
}


