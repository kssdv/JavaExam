//Index of 1

package myproject01;

import java.util.Scanner;

public class exam83 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
		int[] line = str2int(sc.nextLine().split(" "));
		int cnt = 0;
		
		for(int i=0; i<line.length; i++) {
			if(line[i] == 1) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
	
	public static int[] str2int(String[] str) {
		int[] lst = new int[str.length];
		for(int i=0; i<str.length; i++) {
			lst[i] = Integer.parseInt(str[i]);
		}
		return lst;
	}
}
