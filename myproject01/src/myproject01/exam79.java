//

package myproject01;

import java.util.Scanner;

public class exam79 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = str2int(sc.nextLine().split(" "));
		int sum = 0;
		int[] line = str2int(sc.nextLine().split(" "));
		for(int i=num[1]-1; i<num[2]; i++) {
			sum += line[i];
		}
		System.out.println(sum);
	}
	
	public static int[] str2int(String[] str) {
		int[] lst = new int[str.length];
		for(int i=0; i<str.length; i++) {
			lst[i] = Integer.parseInt(str[i]);
		}
		return lst;
	}
}
