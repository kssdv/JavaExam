package myproject01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exam49 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		List<String> lst = new ArrayList<>();
		
		for(int i=0; i<n; i++) {
			lst.add(sc.nextLine());
		}
		String[] num = sc.nextLine().split(" ");
		
		lst.add(Integer.parseInt(num[0]), num[1]);
		
		for(int i=0; i<lst.size(); i++) {
			System.out.println(lst.get(i));
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
