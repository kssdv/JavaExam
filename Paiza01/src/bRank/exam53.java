package bRank;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class exam53 {

	public static void main(String[] args) {
		// 対象の文字列
        String input = "abc123def456ghi789";
        input = "01abcdefg23";
        List<Integer> idxs = new ArrayList<>();
        int startIdx = 0;
        
        // 正規表現パターン
        String regex = "\\d+"; // 数字の連続にマッチ
        
        // PatternとMatcherを作成
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        
        // マッチした部分文字列のインデックス情報を出力
        while (matcher.find()) {
//            System.out.println("Matched: " + matcher.group());
//            System.out.println("Start Index: " + matcher.start());
//            System.out.println("End Index: " + matcher.end());
        		int start = matcher.start();
        		int end = matcher.end();
        		
        		for(int i=start; i<end; i++) {
//        			System.out.println(input.substring(startIdx, i+1));
        			System.out.println(input.substring(start, i+1));
        		}
        }
	}
}
