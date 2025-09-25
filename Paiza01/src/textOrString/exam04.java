package textOrString;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class exam04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
//		{n}の直前の文字をn回繰り返す
//		String regex = "CVE-[0-9]{4}";
		
//		{n,}の直前の文字をn回以上繰り返す
//		String regex = "To be continued\\.{3,}";
		
//		{,n} 直前の文字をn回以下繰り返す
//		String regex = "database_.{0,5}\\.db";
//		String regex = "\\$[0-9]{3,5}";
		
//		"|"で区切られた二つの文字列のひとつならオッケー
//		String regex = "accept|reject|pending";
		
//		()丸かっこでか困った文字列は文字列のまとまりを表す。
//		String regex = "[^ ]+\\.(jpg|png)";
		
//		(plz)+ "plz"を一回以上繰り返すこと
//		String regex = "(\\%[0-9a-zA-Z]{2}){2,}";
		
//		^キャレット（ハット）は、行頭を表す。
//		String regex = "^Re:";
		
//		$は行末を表す。
//		String regex = "[(].*[)]$";
		String regex = "\\(.*\\)$";
		
		Pattern pattern = Pattern.compile(regex);
//		{n}の直前の文字をn回繰り返す
		Matcher matcher = pattern.matcher(input);
		
		if(matcher.find()) {
			int res = matcher.start();
			if(res > 0) {
				System.out.println(res);
			}
//			System.out.println(matcher.start());
//			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}
