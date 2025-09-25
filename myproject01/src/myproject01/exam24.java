package myproject01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exam24 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());
		String[] line = sc.nextLine().split(" ");
		List<String> YoN = new ArrayList<>();
		
		for(int i=1; i<line.length; i++) {
			boolean flag = false;
			for(int j=0; j<i; j++) {
				if(line[i].equals(line[j])) {
					flag = true;
				}
			}
			if(flag) {
				YoN.add("Yes");
			}else {
				YoN.add("No");
			}
		}
		System.out.println(String.join("\n", YoN));
	}
}
