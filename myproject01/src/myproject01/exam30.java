package myproject01;

import java.util.Scanner;

public class exam30 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String res = "";
		
		boolean isDot = false;
		if(line.contains(".")) {
			isDot = true;
		}
	
		if(isDot) {
			String[] temp = line.split("\\.");
			for(int i=0; i<temp.length; i++) {
				if(i == 0) {
					res = temp[i]+".";
				}else {
					res = res + temp[i];
				}
			}
			System.out.println(res.replaceFirst("^0+(?!\\.)", "").replaceAll("0+$", ""));
		}else {
			res = line;
			System.out.println(res.replaceFirst("^0+", ""));
		}
		
		// 左側のすべての0を削除 001.234 -> 1.234, 000.123 -> .123
//		System.out.println(res.replaceFirst("^0+", ""));
		// 右側のすべての0を削除 1.234000 -> 1.234
//		System.out.println(res.replaceAll("0$", ""));
		// 0前の0は残して左側の0をすべて消す 000.1234 -> 0.1234
//		System.out.println(res.replaceFirst("^0+(?!\\.)", ""));
	}
	
}
