package myproject02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exam16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = Integer.parseInt(sc.nextLine());
		List<String> mlst = new ArrayList<>();
		
		for(int i=0; i<m; i++) {
			String t = sc.nextLine();
			mlst.add(t);
		}
		
		int n = Integer.parseInt(sc.nextLine());
		List<String> nlst = new ArrayList<>();
		for(int i=0; i<n; i++) {
			String t = sc.nextLine();
			nlst.add(t);
		}
		
		for(int i=0; i<mlst.size(); i++) {
			for(int j=0; j<nlst.size(); j++) {
				boolean t = false;
				t = nlst.get(j).contains(mlst.get(i));
				System.out.println(t ? "YES" : "NO");
			}
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
