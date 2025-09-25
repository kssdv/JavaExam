package myproject02;

import java.util.Scanner;

public class exam48 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] num = sc.nextLine().split(" ");
		int[] box = str2int(sc.nextLine().split(" "));
		int n = Integer.parseInt(num[1]);
		
		for(int i=0; i<n; i++) {
			int temp = Integer.parseInt(sc.nextLine());
			int box1 = temp - box[0];
			int box2 = temp - box[1];
			box1 = box1 < 0 ? box1 * (-1) : box1;
			box2 = box2 < 0 ? box2 * (-1) : box2;
			
			if(box1 <= 0) {
				System.out.println(box[0]);
			}else if(box2 <= box1) {
				System.out.println(box[1]);
			}else {
				System.out.println(box[0]);
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


