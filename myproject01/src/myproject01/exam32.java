//123+456-789

package myproject01;

import java.util.Scanner;

public class exam32 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
//		String line = "781781+272-178781+3919-1737389";
		String num = "";
		int res = 0;
		int start = 0;
		String kake = "";
		
		if(line.split("\\+")[0].length() > line.split("-")[0].length()) {
			res = Integer.parseInt(line.split("-")[0]);
			start = line.split("-")[0].length();
		}else {
			res = Integer.parseInt(line.split("\\+")[0]);
			start = line.split("\\+")[0].length();
		}
		
		for(int i=start; i<line.length(); i++) {
			//line[i]が数字の場合
			String line_str = line.charAt(i)+"";
			
			if(line_str.matches("[0-9]")) {
				num += line.charAt(i)+"";
				if(i == line.length() - 1) {
					if(!kake.equals("-")) {
						res += Integer.parseInt(num);
					}else {
						res -= Integer.parseInt(num);
					}
				}
			}else if(kake.equals("+")) {
				kake = "+";
				if(!num.equals("")) {
					res += Integer.parseInt(num);
				}
				
				num = "";
			}else if(kake.equals("-")) {
				if(!num.equals("")) {
					res -= Integer.parseInt(num);
				}
				kake = "-";
				num = "";
			}
			if(!line_str.matches("[0-9]")) {
				kake = line_str; 
			}
		}
		System.out.println(res);
	}
}
