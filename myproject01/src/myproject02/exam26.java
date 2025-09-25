package myproject02;

import java.util.Scanner;

public class exam26 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean flag = true;
		int i = 10000;
		while(true) {
			if(i >= 10000 && i % 13 == 0) {
				break;
//				flag = false;
			}else {
				i++;
			}
		}
		System.out.println(i);
	}
}


