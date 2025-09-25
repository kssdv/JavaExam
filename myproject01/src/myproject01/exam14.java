package myproject01;

import java.util.Scanner;

public class exam14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());
		String[] line = sc.nextLine().split(" ");
		int[] cnt = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		
		for(int i=0; i<num; i++) {
			for(int j=0; j<10; j++) {
				if(Integer.parseInt(line[i]) == j) {
					cnt[j]++;
				}
			}
		}
		for(int i=0; i<cnt.length; i++) {
			if(i == 0) {
				System.out.print(cnt[i]);
			} else {
				System.out.print(" "+cnt[i]);
			}
		}
	}
}
