package myproject03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class exam11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		Dictionary<Integer, String> dictionary = new Hashtable<>();
		List<Integer> lst = new ArrayList<>();
		String[] num = sc.nextLine().split(" ");
		int x = Integer.parseInt(num[1]); // 転校生
		int p = Integer.parseInt(num[2]); // Paiza本人
		lst.add(p);
		lst.add(x);
		
		for(int i=0; i<Integer.parseInt(num[0]); i++) {
			int h = Integer.parseInt(sc.nextLine());
			lst.add(h);
		}
		Collections.sort(lst);
		
		for(int i=0; i<lst.size(); i++) {
			if(lst.get(i) == p) System.out.println(i+1);
		}
	}
}
