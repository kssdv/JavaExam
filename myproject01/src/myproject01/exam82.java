//

package myproject01;

import java.util.Scanner;

public class exam82 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
		int[] line = str2int(sc.nextLine().split(" "));
		int min = line[0];
		for(int i=1; i<line.length; i++) {
			if(min > line[i]) {
				min = line[i];
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
