package bRank;

import java.util.Arrays;
import java.util.Scanner;

public class exam15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] sarray = sc.nextLine().split(" ");
		int num1 = Integer.parseInt(sarray[0]);
		int num2 = Integer.parseInt(sarray[1]);
		int[] numbers = new int[num1];
		
		for(int i=0; i<num1; i++) {
			numbers[i] = Integer.parseInt(sc.nextLine());
		}
		for(int i=0; i<num2; i++) {
			String[] tmp = sc.nextLine().split(" ");
			int start = Integer.parseInt(tmp[0])-1;
			int end = Integer.parseInt(tmp[1]);
			int sum = Arrays.stream(numbers, start ,end).sum();
			System.out.println(sum);
		}
		
	}

}
