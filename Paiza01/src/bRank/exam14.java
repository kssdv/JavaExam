package bRank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exam14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> numbers = new ArrayList<>();
		List<Integer> lst = new ArrayList<>();
		String[] tmp = sc.nextLine().split(" ");
		int num1 = Integer.parseInt(tmp[0]);
		int num2 = Integer.parseInt(tmp[1]);
		
		for(int i=0; i<num1; i++) {
			int t = Integer.parseInt(sc.nextLine());
			numbers.add(t);
		}
		for(int i=0; i<num2; i++) {
			String[] t = sc.nextLine().split(" ");
			int startIndex = Integer.parseInt(t[0])-1;
			int endIndex = Integer.parseInt(t[1]);
			int sum = 0;
//			List<Integer> tlst = new ArrayList<>();
//			for(int j=Integer.parseInt(t[0])-1; j<Integer.parseInt(t[1]); j++) {
//				tlst.add(numbers.get(j));
////				sum += numbers.get(j);
//			}
//			sum = tlst.stream().mapToInt(Integer::intValue).sum();
			sum = numbers.subList(startIndex, endIndex).stream()
                    .mapToInt(Integer::intValue)
                    .sum();
			System.out.println(sum);
//			lst.add(t);
		}
//		numbers.stream()
	}

}
