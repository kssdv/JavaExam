package myproject02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exam20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		List<String> lst = new ArrayList<>();
		
		for(int i=0; i<n; i++) {
			lst.add(sc.nextLine());
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(Integer.parseInt(lst.get(i).split(" ")[1]) > Integer.parseInt(lst.get(j).split(" ")[1])) {
					String tmp = lst.get(i);
					lst.set(i, lst.get(j));
					lst.set(j, tmp);
				}
				else if(Integer.parseInt(lst.get(i).split(" ")[1]) == Integer.parseInt(lst.get(j).split(" ")[1]) && Integer.parseInt(lst.get(i).split(" ")[0]) > Integer.parseInt(lst.get(j).split(" ")[0])) {
					String tmp = lst.get(i);
					lst.set(i, lst.get(j));
					lst.set(j, tmp);
				}
			}
		}
		for(String s : lst) {
			System.out.println(s);
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
