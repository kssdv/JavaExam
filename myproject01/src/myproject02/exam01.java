package myproject02;

import java.util.Scanner;

public class exam01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = s2i(sc.nextLine().split(" "));
		String[][] lst = new String[num[0]][num[1]];
		
		for(int i=0; i<num[0]; i++) {
//			Scanner sc2 = new Scanner(System.in);
			lst[i] = sc.nextLine().split(" ");
		}
//		System.out.println(lst[1][2]);
//		for(int i=0; i<lst.length; i++) {
//			for(int j=0; j<lst[0].length; j++) {
//				System.out.print(j==0?lst[i][j] : " "+lst[i][j]);
//			}
//			System.out.println();
//		}
		
		// lst[0][0], lst[0][1], lst[0][2]
		
		// lst[0][0], lst[1][0]
		// lst[0][1], lst[1][1]
		// ...
		
		for(int i=0; i<lst[0].length; i++) {
			for(int j=0; j<lst.length; j++) {
				System.out.print(j == 0 ? lst[j][i] : " "+lst[j][i]);
			}
			
			System.out.println();
		}
	}
	
	public static int[] s2i(String[] slst) {
		int[] lst = new int[slst.length];
		for(int i=0; i<slst.length; i++) {
			lst[i] = Integer.parseInt(slst[i]);
		}
		
		return lst;
	}
}
