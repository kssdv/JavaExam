package myproject01;

import java.util.Scanner;

public class exam38 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
		int[] lst = str2int(sc.nextLine().split(" "));
		double sum = sumList(lst);
		double avg = sum/lst.length;
		System.out.println("avg : "+avg);
		
		for(int i=0; i<lst.length; i++) {
			if(lst[i] >= avg) {
				System.out.println(lst[i]);
			}
		}
	}
	
	public static int[] str2int(String[] str) {
		int[] lst = new int[str.length];
		for(int i=0; i<str.length; i++) {
			lst[i] = Integer.parseInt(str[i]);
		}
		
		return lst;
	}
	
	public static int sumList(int[] lst) {
		int sum = 0;
		for(int i=0; i<lst.length; i++) {
			sum += lst[i];
		}
		System.out.println("sum : "+sum);
		
		return sum;
	}
}
