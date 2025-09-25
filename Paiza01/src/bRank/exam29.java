package bRank;
// 4 4 1
// 2 3 3
// ...
import java.util.Scanner;

public class exam29 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] hw = str2int(sc.nextLine().split(" "));
		int h = hw[0];
		int w = hw[1];
		int d = hw[2];
		int[][] lst = new int[h][w];
		
		if(d == 1) {
			d1(lst);
		}else if(d == 2){
			d2(lst);
		}else if(d == 3) {
			d3(lst);
		}else if(d == 4) {
			d4(lst);
		}
		zahyoPrint(lst);
		
	}
	
	public static void d1(int[][] lst) {
		int x = 0;
		int y = 0;
		int cnt = 0;
		boolean flag = true;
		
		while(flag) {
			flag = false;
			if(x < lst[0].length && y >= 0) {
				cnt++;
				lst[y][x] = cnt;
			}
			if(x+1 < lst[0].length && y-1 >= 0) {
				flag = true;
				x++;
				y--;
			}else {
				x++;
				while(y+1 < lst.length && x-1 >= 0) {
					x--;
					y++;
					flag = true;
				}
			}
		}
	}
	public static void d2(int[][] lst) {
		int cnt = 0;
		for(int i=0; i<lst.length; i++) {
			for(int j=0; j<lst[0].length; j++) {
				cnt++;
				lst[i][j] = cnt;
			}
		}
	}
	
	public static void d3(int[][] lst) {
		int cnt = 0;
		for(int i=0; i<lst[0].length; i++) {
			for(int j=0; j<lst.length; j++) {
				cnt++;
				lst[j][i] = cnt;
			}
		}
	}
	
	public static void d4(int[][] lst) {
		int x = 0;
		int y = 0;
		int cnt = 0;
		boolean flag = true;
		
		while(flag) {
			flag = false;
			if(y < lst.length && x >= 0) {
				cnt++;
				lst[y][x] = cnt;
			}
			if(y+1 < lst.length && x-1 >= 0) {
				flag = true;
				y++;
				x--;
			}else {
				y++;
				while(x+1 < lst[0].length && y-1 >= 0) {
					y--;
					x++;
					flag = true;
				}
			}
		}
	}
	
	public static void zahyoPrint(int[][] lst) {
		for(int i=0; i<lst.length; i++) {
			for(int j=0; j<lst[0].length; j++) {
				String t = j == 0 ? lst[i][j]+"" : " "+lst[i][j];
				System.out.print(t);
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
