package myproject02;

import java.util.Scanner;

public class exam58 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] tags = sc.nextLine().split(" ");
		String str = sc.nextLine();
		
		if(str.split(tags[0]).length > 0) {
			String[] intags = str.split(tags[0]);
			for(int i=1; i<intags.length; i++) {
				String s = intags[i];
				if(s.split(tags[1]).length > 0) {
					System.out.println(s.split(tags[1])[0]);
				}else {
					System.out.println("<blank>");
				}
			}
		}
		
	}
}
