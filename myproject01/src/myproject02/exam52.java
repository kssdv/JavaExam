package myproject02;

import java.util.Scanner;

// max 1500
public class exam52 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] num = str2double(sc.nextLine().split(" "));
		System.out.printf("%f",num[0] * (1 - num[1]/100) * (1 - num[2]/100));
		
		
	}
	public static double[] str2double(String[] s) {
		double[] lst = new double[s.length];
		for(int i=0; i<s.length; i++) {
			lst[i] = Double.parseDouble(s[i]);
		}
		return lst;
	}
}


