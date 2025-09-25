//

package myproject01;

import java.util.Scanner;

public class exam80 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
		int[] line1 = str2int(sc.nextLine().split(" "));
		int[] line2 = str2int(sc.nextLine().split(" "));
		for(int i=0; i<line1.length; i++) {
			System.out.println(line1[i] - line2[i]);
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
