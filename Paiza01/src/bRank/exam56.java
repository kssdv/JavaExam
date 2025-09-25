package bRank;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class exam56 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String pregex = "p[a|@|4][i|!|1][z|2][a|@|4]";
		Pattern pattern = Pattern.compile(pregex);
		Matcher pmatcher = pattern.matcher(str);
		
		if(str.contains("paiza")) {
			System.out.println("paiza");
		}else if(pmatcher.find()) {
			System.out.println("leet");
		}else {
			System.out.println("nothing");
		}
	}
}
