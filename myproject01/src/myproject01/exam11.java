package myproject01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exam11 {
	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		String[] line = sc.nextLine().split(" ");
		for(int i=0; i<line.length; i++) {
			nums.add(Integer.parseInt(line[i]));
		}
		int max = nums.get(0);
		int min = nums.get(0);
		for(int i=0; i<3; i++) {
			if(max < nums.get(i)) {
				max = nums.get(i);
			}
			if(min > nums.get(i)) {
				min = nums.get(i);
			}
		}
		System.out.println(max-min);
	}
}
