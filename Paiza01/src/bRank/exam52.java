package bRank;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class exam52 {

	public static void main(String[] args) {
		// 対象の文字列
        String input = "abc123def456ghi789";
        input = "01abcdefg23";
        
        // 正規表現パターン
        String regex = "\\d+"; // 数字の連続にマッチ
        
        // PatternとMatcherを作成
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        
        // マッチした部分文字列のインデックス情報を出力
        while (matcher.find()) {
            System.out.println("Matched: " + matcher.group());
            System.out.println("Start Index: " + matcher.start());
            System.out.println("End Index: " + matcher.end());
        }
	}
}
