//

package myproject01;

import java.util.Scanner;

public class exam78 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] lst = str2int(sc.nextLine().split(" "));
		for(int i=0; i<lst[1]; i++) {
			System.out.println(lst[0]);
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
