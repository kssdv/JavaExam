package bRank;

import java.util.Scanner;

public class exam65 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] num = sc.nextLine().split(" ");
		String[][] lst = new String[Integer.parseInt(num[0])][Integer.parseInt(num[1])];
		for(int i=0; i<lst.length; i++) {
			lst[i] = sc.nextLine().split("");
		}
		
		for(int i=0; i<Integer.parseInt(num[2]); i++) {
			String[] tmp = sc.nextLine().split(" ");
			int n = Integer.parseInt(tmp[1]) - 1;
			
			// Yoko
			if(Integer.parseInt(tmp[0]) == 1) {
//				lst[n]
				for(int j=1; j<lst[0].length; j++) {
//					lst[n][j] = lst[n][j].equals(".") ? "#" : ".";
					String t = lst[n][j-1];
					lst[n][j-1] = lst[n][j];
					lst[n][j] = t;
				}
			// Tate
			}else if(Integer.parseInt(tmp[0]) == 2) {
				for(int j=1; j<lst.length; j++) {
//					lst[n][j] = lst[n][j].equals(".") ? "#" : ".";
					String t = lst[j-1][n];
					lst[j-1][n] = lst[j][n];
					lst[j][n] = t;
				}
			}
		}
		
		for(String[] s1 : lst) {
			System.out.println(String.join("", s1));
		}
	}
	
}
