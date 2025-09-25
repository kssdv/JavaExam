//Index of 1

package myproject01;

import java.util.Scanner;

public class exam91 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
		int[] line = str2int(sc.nextLine().split(" "));
		int max = 0;
		int min = 0;
		boolean flag = true;
		
		for(int i=0; i<line.length; i++) {
			if(max < line[i] + i+1) {
				max = line[i] + i+1;
			}
			
			if(min > line[i] + i+1 || flag) {
				min = line[i] + i+1;
				flag = false;
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
