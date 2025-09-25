package bRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class exam70 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> numbers = new ArrayList<>();
		int k = Integer.parseInt(sc.nextLine().split(" ")[1]);
		int[] lst = str2int(sc.nextLine().split(" "));
		int sum = 0;
		
//		for(int i=0; i<10; i++) {
//			int randomInt = (int) (Math.random() * 100) + 1;
//			numbers.add(randomInt);
//		}
//		
//		System.out.println(numbers.toString());
//		Collections.sort(numbers);
//		System.out.println(numbers.toString());
//		for(int i=numbers.size()-1; i>numbers.size()-1-k; i--) {
//			sum += numbers.get(i);
//		}
		Arrays.sort(lst);
		for(int i=lst.length-1; i>lst.length-1-k; i--) {
			sum += lst[i];
		}
		System.out.println(sum);
	}
	
	private static int[] str2int(String[] str) {
		int[] lst = new int[str.length];
		for(int i=0; i<str.length; i++) {
			lst[i] = Integer.parseInt(str[i]);
		}
		
		return lst;
	}
}
