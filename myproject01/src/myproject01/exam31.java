//1+2+3
//6

package myproject01;

import java.util.Scanner;

public class exam31 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		int res = Integer.parseInt(line.charAt(0)+"");
		
		for(int i=1; i<line.length(); i++) {
			String temp = line.charAt(i)+"";
			
			if(temp.equals("+")) {
				res += Integer.parseInt(line.charAt(i+1)+"");
			}else if(temp.equals("-")) {
				res -= Integer.parseInt(line.charAt(i+1)+"");
			}
		}
		System.out.println(res);
	}
}
