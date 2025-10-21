package tip;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class exam06 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(br.readLine());
//		st = new StringTokenizer(br.readLine());
		
//		int n = Integer.parseInt(st.nextToken());
//		st = new StringTokenizer(br.readLine());
		
//		for(int i=0; i<3; i++) {
//			String n = st.nextToken();
//			System.out.println(n);
//		}
		
		System.out.print("数字を入力してください: ");
		String input = br.readLine();
		
		int num = Integer.parseInt(input);
		
		System.out.println("入力された数字: " + num);
		
		System.out.print("複数の数字を空白区切りで入力してください");
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<st.countTokens(); i++) {
			System.out.println(st.nextToken());
		}
		
		br.close();
	}

}
