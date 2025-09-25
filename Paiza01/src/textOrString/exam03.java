package textOrString;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class exam03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
//		String regex = "\\(\\^ \\. \\^\\)\\/";
//		"."は任意の一文字
//		String regex = "p..za";
		
//		[]は一つの文字を表す、その中にある文字の1つならオッケー
//		String regex = "Math[123][ABC]";
		
//		[]のなかに^がついていたらいてはならない文字とする
//		String regex = "[^0123456789]";
//		String regex = "[A-Z]-[0-9][0-9][ab]";
		
//		"?"は直前の一文字があってもなくても大丈夫とする
//		O?K -> OK == K
//		String regex = "clang-?format";
		
//		"*"は以前の文字を0回以上繰り返せても同じ文字列とする
//		hi* -> hi == hiiiii == h
		
//		"+"は一回以上繰り返しても同じ文字列とする
//		hi+ -> hi == hiii != h
//		String regex = "congratulations!*";
		String regex = "ID-[0-9]+";
		
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(input);
		
		if(matcher.find()) {
			System.out.println(matcher.start());
		}else {
			System.out.println("Not Found");
		}
	}

}
