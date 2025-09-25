package bRank;

import java.util.Scanner;

public class exam27 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] hw = str2int(sc.nextLine().split(" "));
		int h = hw[0];
		int w = hw[1];
		String[][] zahyo = new String[h][w];
		for(int i=0; i<h; i++) {
			String tmp = sc.nextLine();
			zahyo[i] = tmp.split("");
		}
		
		int[] yx = str2int(sc.nextLine().split(" "));
		int y = yx[0];
		int x = yx[1];
		
		int ylen = zahyo.length;
		int xlen = zahyo[0].length;
		
		if(isNotOver(y-1, ylen) && isNotOver(x, xlen)) {
			cngZahyo(zahyo, y-1, x);
		}
		if(isNotOver(x-1, xlen) && isNotOver(y, ylen)) {
			cngZahyo(zahyo, y, x-1);
		}
		if(isNotOver(x, xlen) && isNotOver(y, ylen)) {
			cngZahyo(zahyo, y, x);
		}
		if(isNotOver(x+1, xlen) && isNotOver(y, ylen)) {
			cngZahyo(zahyo, y, x+1);
		}
		if(isNotOver(x, xlen) && isNotOver(y+1, ylen)) {
			cngZahyo(zahyo, y+1, x);
		}
		
		zahyoPrint(zahyo);
	}
	
	public static boolean isNotOver(int n, int len) {
		boolean flag = false;
		if(n >= 0 && n <= len-1) {
			flag = true;
		}
		return flag;
	}
	
	public static void cngZahyo2(String[][] zahyo, int y, int x) {
		int ylen = zahyo.length;
		int xlen = zahyo[0].length;
		
		if(isNotOver(y, ylen) && isNotOver(x, xlen)) {
			cngZahyo(zahyo, y, x);
		}
		boolean flag = true;
		int a = 1;
		while(flag) {
			flag = false;
			if(isNotOver(y+a, ylen) && isNotOver(x+a, xlen)){
				cngZahyo(zahyo, y+a, x+a);
				flag = true;
			}if(isNotOver(y+a, ylen) && isNotOver(x-a, xlen)) {
				cngZahyo(zahyo, y+a, x-a);
				flag = true;
			}if(isNotOver(y-a, ylen) && isNotOver(x-a, xlen)) {
				cngZahyo(zahyo, y-a, x-a);
				flag = true;
			}if(isNotOver(y-a, ylen) && isNotOver(x+a, xlen)) {
				cngZahyo(zahyo, y-a, x+a);
				flag = true;
			}
			a++;
		}
		
	}
	
	public static void cngZahyo(String[][] zahyo, int y, int x) {
		zahyo[y][x] = zahyo[y][x].equals("#") ? "." : "#";
	}
	
	public static void zahyoPrint(String[][] zahyo) {
		for(int i=0; i<zahyo.length; i++) {
			for(int j=0; j<zahyo[1].length; j++) {
				System.out.print(zahyo[i][j]);
			}
			System.out.println();
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
