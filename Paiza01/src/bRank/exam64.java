package bRank;

import java.util.Scanner;

public class exam64 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		String[] lst = sc.nextLine().split(" ");
		int q = Integer.parseInt(sc.nextLine());
		for(int i=0; i<q; i++) {
			String[] tmp = sc.nextLine().split(" ");
			int idx1 = Integer.parseInt(tmp[0])-1;
			int idx2 = Integer.parseInt(tmp[1])-1;
			
			String t = lst[idx1];
			lst[idx1] = lst[idx2];
			lst[idx2] = t;
		}
		
		System.out.println(String.join(" ", lst));
	}
	
}
