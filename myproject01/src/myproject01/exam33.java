//1234567890
//9876543210

//1111111100

//2872
//6163

//8035

package myproject01;

import java.util.Scanner;

public class exam33 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num1 = sc.nextLine();
		String num2 = sc.nextLine();
		String res = "";
		int n = 0;
		
		for(int i=num1.length()-1; i>=0; i--) {
			int temp1 = Integer.parseInt(num1.charAt(i)+"");
			int temp2 = Integer.parseInt(num2.charAt(i)+"");
			
			res = ((temp1+temp2+n)%10+"") + res;
			n = (temp1 + temp2 + n)/10;
		}
		if(n != 0) {
			res = n + res;
		}
		System.out.println(res);
	}
}
