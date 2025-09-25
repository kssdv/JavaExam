package bRank;

import java.util.Scanner;

public class exam17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = str2int(sc.nextLine().split(" "));
		int[][] numbers = new int[num[0]][num[1]];
		
		for(int i=0; i<num[0]; i++) {
			int[] t = str2int(sc.nextLine().split(" "));
			int sum = 0;
			for(int j=0; j<t.length; j++) {
				sum += t[j];
				t[j] = sum;
			}
			numbers[i] = t;
		}
		
		for(int i=0; i<num[2]; i++) {
			int[] n = str2int(sc.nextLine().split(" "));
			int sum = 0;
			int y = n[0];
			int x = n[1];
			
			for(int j=0; j<y; j++) {
				sum += numbers[j][x-1];
			}
			System.out.println(sum);
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
