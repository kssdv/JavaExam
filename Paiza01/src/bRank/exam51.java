package bRank;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class exam51 {

	public static void main(String[] args) {
		String input = "01abcdefg23";
		input = "81zaaz18";
//		String regex = "[0-9][a-zA-Z]*[0-9]";
//		String regex = "[0-9]*[a-zA-Z]*[0-9]*;";
		String regex = "\\d";
		
		
		
		for(String s : input.split("")) {
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(s);
			
			if(matcher.find()) {
				System.out.println(s);
			}
		}
//		if(matcher.find()) {
//			System.out.println(matcher.group());
//			System.out.println(matcher.start());
//			System.out.println(matcher.end());
//		}
	
	}
}
