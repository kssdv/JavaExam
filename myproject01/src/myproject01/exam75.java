//

package myproject01;

import java.util.Scanner;

public class exam75 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = str2int(sc.nextLine().split(" "));
		double x = num[2] + 0.1;
		
		if(num[0] * num[1] < x) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
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
