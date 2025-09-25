//

package myproject01;

import java.util.Scanner;

public class exam76 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = str2int(sc.nextLine().split(" "));
		int min = num[0] * num[0];
		for(int i=num[0]; i<=num[1]; i++) {
			for(int j=num[0]; j<=num[1]; j++) {
				if(i * j < min) {
					min = i * j;
				}
			}
		}
		System.out.println(min);
	}
	
	public static int[] str2int(String[] str) {
		int[] lst = new int[str.length];
		for(int i=0; i<str.length; i++) {
			lst[i] = Integer.parseInt(str[i]);
		}
		return lst;
	}
}
