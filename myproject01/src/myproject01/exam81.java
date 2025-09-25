//

package myproject01;

import java.util.Scanner;

public class exam81 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
		int[] line1 = str2int(sc.nextLine().split(" "));
		for(int i=line1.length-1; i>=0; i--) {
			System.out.println(line1[i]);
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
