package bRank;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class exam54 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		String str1 = sc.nextLine();
		String str = "1abc2efg345";
		String regex = "\\d";
		int startIdx = 0;
		
		Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
		
		for(int i=0; i<str.length(); i++) {
			Matcher tmatcher2 = pattern.matcher(str.substring(i, i+1));
			if(tmatcher2.find()) {
				startIdx = i;
				for(int j=i; j<str.length(); j++) {
					Matcher tmatcher = pattern.matcher(str.substring(j, j+1));
					if(tmatcher.find()) {
						System.out.println(str.substring(startIdx, j+1));
					}
				}
			}
		}
	}
}
