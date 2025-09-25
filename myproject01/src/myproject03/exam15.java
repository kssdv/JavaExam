package myproject03;

import java.util.Scanner;

public class exam15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] n = sc.nextLine().split(" ");
		int h = Integer.parseInt(n[0]);
		int w = Integer.parseInt(n[1]);
		String[][] lst = new String[h][w];
		
		for(int i=0; i<Integer.parseInt(n[0]); i++) {
			String[] t = sc.nextLine().split("");
			for(int j=0; j<t.length; j++) {
				lst[i][j] = t[j];
			}
		}
		String[] t = sc.nextLine().split(" ");
		int y = Integer.parseInt(t[0]);
		int x = Integer.parseInt(t[1]);
		int tx = x;
		int ty = y-1 <0 ? 0 : y-1;
		
		lst[ty][tx] = lst[ty][tx].equals(".") ? "#" : ".";
		ty = y;
		tx = x-1 <0 ? 0 : x-1;
		
		lst[ty][tx] = lst[ty][tx].equals(".") ? "#" : ".";
		tx = x;
		
		lst[ty][tx] = lst[ty][tx].equals(".") ? "#" : ".";
		tx = x + 1 >= lst[0].length ? lst[0].length - 1 : x + 1;
		
		lst[ty][tx] = lst[ty][tx].equals(".") ? "#" : ".";
		ty = y + 1 >= lst.length ? lst.length - 1 : y + 1;
		tx = x;
		
		lst[ty][tx] = lst[ty][tx].equals(".") ? "#" : ".";
		
		for(int i=0; i<lst.length; i++) {
			for(int j=0; j<lst[0].length; j++) {
				System.out.print(lst[i][j]);
			}
			System.out.println();
		}
	
	}

}
