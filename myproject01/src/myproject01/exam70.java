package myproject01;

import java.util.Scanner;

public class exam70 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = str2int(sc.nextLine().split(" "));
		boolean flag = false;
		
		if(num[0] +num[1] == 0 || num[0] -num[1] == 0) {
			flag = true;
		}else if((num[0] + num[1]) + num[2] == 0 || (num[0] + num[1]) - num[2] == 0){
			flag = true;
		}else if((num[0] - num[1]) + num[2] == 0 || (num[0] - num[1]) - num[2] == 0){
			flag = true;
		}
		System.out.println(flag ? "YES" : "NO");
	}
	
	public static int[] str2int(String[] str) {
		int[] lst = new int[str.length];
		for(int i=0; i<str.length; i++) {
			lst[i] = Integer.parseInt(str[i]);
		}
		return lst;
	}
}
