package textOrString;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class exam01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		String input = "https://paiza.jp/";
		String input = sc.nextLine();
		String regex = "paiza";
		
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(input);
		
		if(matcher.find()) {
			System.out.println(matcher.start());
		}else {
			System.out.println("Not Found");
		}
	}

}
