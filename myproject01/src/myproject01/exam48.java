package myproject01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exam48 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());
		List<Integer> lst = new ArrayList<>();
		
		for(int i=0; i<num; i++) {
			lst.add(Integer.parseInt(sc.nextLine()));
		}
		int[] nums = str2int(sc.nextLine().split(" "));
		
		int t = lst.get(nums[0]-1);
		lst.set(nums[0]-1, lst.get(nums[1]-1));
		lst.set(nums[1]-1, t);
		
		for(Integer i : lst) {
			System.out.println(i);
		}
		
	}
	
	public static int[] str2int(String[] str) {
		int[] lst = new int[str.length];
		for(int i=0; i<str.length; i++) {
			lst[i] = Integer.parseInt(str[i]);
		}
		return lst;
	}
}
