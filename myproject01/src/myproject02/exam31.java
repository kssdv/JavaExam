package myproject02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exam31 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		List<String> lst = new ArrayList<>();
		List<String> temp = new ArrayList<>();
		
		for(int i=0; i<n; i++) {
			String t = sc.nextLine();
			lst.add(t);
		}
		
		for(int i=lst.size()-1; i>=0; i--) {
			boolean flag = true;
			for(int j=0; j<temp.size(); j++) {
				if(lst.get(i).equals(temp.get(j))) {
					flag = false;
				}
			}
			if(flag) {
				temp.add(lst.get(i));
			}
		}
		
		for(int i=0; i<temp.size(); i++) {
			System.out.println(temp.get(i));
		}
		
	}
}


