//15 12 0
// YES

package myproject01;

import java.util.Scanner;

public class exam66 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] line = str2int(sc.nextLine().split(" "));
		System.out.println(((line[0] >= 10) && (line[1] >= 10)) || (line[2] >= 10) ? "YES" : "NO");
	}
	public static int[] str2int(String[] str) {
		int[] lst = new int[str.length];
		for(int i=0; i<str.length; i++) {
			lst[i] = Integer.parseInt(str[i]);
		}
		return lst;
	}
}
