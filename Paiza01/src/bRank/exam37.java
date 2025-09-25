package bRank;

import java.util.Scanner;

public class exam37 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] yxh = str2int(sc.nextLine().split(" "));
		int[] llist = str2int(sc.nextLine().split(" "));
		int[] mlist = str2int(sc.nextLine().split(" "));
		int y = yxh[0];
		int x = yxh[1];
		int h = yxh[2];
		int max = 0;
		
		if(h <= llist[0]) {
			// x, yのなかで最大値
			if(x > y) {
				max = x;
			}else {
				max = y;
			}
			if(max <= llist[1]) {
				System.out.println(mlist[0]);
			}else if(max <= llist[2]) {
				System.out.println(mlist[1]);
			}else {
				System.out.println(mlist[2]);
			}
		}else {
			// x, y, hで最大値
			if(x > y) {
				if(x > h) {
					max = x;
				}else {
					max = h;
				}
			}else {
				if(y > h) {
					max = y;
				}else {
					max = h;
				}
			}
			if(max <= llist[3]) {
				System.out.println(mlist[3]);
			}else if(max <= llist[4]) {
				System.out.println(mlist[4]);
			}else {
				System.out.println(x*y*h*mlist[5]);
			}
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
