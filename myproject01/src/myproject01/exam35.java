package myproject01;

import java.util.Scanner;

public class exam35 {
	public static <PlusStrs> void main(String[] args) {
		exam35 obj = new exam35();
		Scanner sc = new Scanner(System.in);
		
		String num1 = "0"+sc.nextLine();
//		String num1 = sc.nextLine();
		String num2 = sc.nextLine();
		String res = String.format("%0"+num1.length()+"d", 0);
//		res = num1;
		
		
		for(int i=num1.length()-1; i>=0; i--) {
			String tmp = String
				.format("%0"+(i+1)+"d", Integer.parseInt(num1.charAt(i)+"") * Integer.parseInt(num2));
//			System.out.println(tmp);
			int t = num1.length()-tmp.length();
			for(int j=0; j<t; j++) {
				tmp += "0";
			}
			res = obj.PlusStrs(res, tmp);
//			System.out.printf("%s (res)\n",res);
		}
//		res = res.charAt(0) == '0' ? res.substring(1) : res;
		res = res.replaceFirst("^0+", "");
		res = res.equals("") ? "0" : res;
		System.out.println(res);
//		System.out.println(res.replaceFirst("^0+", ""));
//		System.out.println("8888888889");
	}
	
	public String PlusStrs(String num1, String num2) {
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
//		System.out.println(res);
		
		return res;
	}
}
