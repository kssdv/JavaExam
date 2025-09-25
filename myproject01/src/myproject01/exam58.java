package myproject01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exam58 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = str2int(sc.nextLine().split(" "));
		List<Integer> lst = new ArrayList<>();
		
		for(int i=0; i<num[1]; i++) {
			int t = Integer.parseInt(sc.nextLine());
			
			if(num[2] < i && lst.size() < num[0] && !lst.contains(t)) {
				lst.add(t);
			}
		}
		
		for(int i : lst) {
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
