package myproject01;

import java.util.Scanner;

public class exam20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] nums = sc.nextLine().split(" ");
		String[] lines = sc.nextLine().split(" ");
		boolean flag = false;
		for(int i=0; i<lines.length; i++) {
			if(nums[1].equals(lines[i])) {
				flag = true;
			}
		}
		
		if(flag) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}
