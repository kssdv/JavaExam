package bRank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exam13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> numbers = new ArrayList<>();
		String t = sc.nextLine();
		int num1 = Integer.parseInt(t.split(" ")[0]);
		int num2 = Integer.parseInt(t.split(" ")[1]);
		int sum = 0;
		for(int i=0; i<num1; i++) {
			int temp = Integer.parseInt(sc.nextLine());
			sum += temp;
			numbers.add(sum);
		}
		for(int i=0; i<num2; i++) {
			int temp = Integer.parseInt(sc.nextLine());
			System.out.println(numbers.get(temp-1));
		}
	}
	
}
