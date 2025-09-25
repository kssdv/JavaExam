package myproject02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Person{
	String name;
	int damage;
}

public class exam22 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Person> lst = new ArrayList<>();
		int n = Integer.parseInt(sc.nextLine());
		for(int i=0; i<n; i++) {
			
		}
		
		int m = Integer.parseInt(sc.nextLine());
		for(int i=0; i<m; i++) {
			
		}
	}
	
	public static int[] str2int(String[] slst) {
		int[] lst = new int[slst.length];
		for(int i=0; i<slst.length; i++) {
			lst[i] = Integer.parseInt(slst[i]);
		}
		
		return lst;
	}
}


