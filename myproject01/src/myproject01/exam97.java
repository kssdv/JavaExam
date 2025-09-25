package myproject01;

import java.util.Scanner;

public class exam97 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = str2int(sc.nextLine().split(" "));
		String[] lst = new String[num[0]];
		int[] res = new int[2];
		
		for(int i=0; i<num[0]; i++) {
			String t = sc.nextLine();
			
			if(t.contains("1")) {
				res[0] = i+1;
				String[] lst_t = t.split(" ");
				for(int j=0; j<lst_t.length; j++) {
					if(lst_t[j].equals("1")) {
						res[1] = j+1;
					}
				}
			}
		}
		System.out.println(res[0]+" "+res[1]);
		
	}
	
	public static int[] str2int(String[] str) {
		int[] lst = new int[str.length];
		for(int i=0; i<str.length; i++) {
			lst[i] = Integer.parseInt(str[i]);
		}
		return lst;
	}
}
