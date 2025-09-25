package myproject02;

import java.util.Scanner;

public class exam66 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		String[][] data = new String[n][4];
		
		for(int i=0; i<n; i++) {
			String[] temp = sc.nextLine().split(" ");
			data[i][0] = temp[0];
			data[i][1] = temp[1];
			data[i][2] = temp[2];
			data[i][3] = temp[3];
//			System.out.println("User{");
//			System.out.println("nickname : "+temp[0]);
//			System.out.println("old : "+temp[1]);
//			System.out.println("birth : "+temp[2]);
//			System.out.println("state : "+temp[3]);
//			System.out.println("}");
		}
		String sel = sc.nextLine();
		
		for(int i=0; i<n; i++) {
			if(data[i][1].equals(sel)) {
				System.out.println(data[i][0]);
			}
		}
		
		
	}
	public static int[] str2int(String[] s) {
		int[] lst = new int[s.length];
		for(int i=0; i<s.length; i++) {
			lst[i] = Integer.parseInt(s[i]);
		}
		return lst;
	}
}
