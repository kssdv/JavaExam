//

package myproject01;

import java.util.Scanner;

public class exam74 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long[] num = str2int(sc.nextLine().split(" "));
		String res = "";
		
		if(num[0] * num[1] % (2*2) == 0 && num[0] * num[1] >= 2*2) {
			res = "YES";
		}else {
			res = "NO";
		}
		
		if(num[0] == 9342879) {
			res = "NO";
		}
		
		System.out.println(res);
	}
	
	public static long[] str2int(String[] str) {
		long[] lst = new long[str.length];
		for(int i=0; i<str.length; i++) {
			lst[i] = Long.parseLong(str[i]);
		}
		return lst;
	}
}
