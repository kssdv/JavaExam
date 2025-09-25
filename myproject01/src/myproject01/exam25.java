package myproject01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class exam25 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());
		String[] line1 = sc.nextLine().split(" ");
		String[] line2 = sc.nextLine().split(" ");
		List<String> result = new ArrayList<>();
		
		result.add(line1[0]);
		for(int i=0; i<num; i++) {
			boolean flag = false;
			for(int j=0; j<result.size(); j++) {
				if(result.get(j).equals(line1[i])) {
					flag = true;
				}
			}
			if(!flag) {
				result.add(line1[i]);
			}
		}
		for(int i=0; i<num; i++) {
			boolean flag = false;
			for(int j=0; j<result.size(); j++) {
				if(result.get(j).equals(line2[i])) {
					flag = true;
				}
			}
			if(!flag) {
				result.add(line2[i]);
			}
		}
		Collections.sort(result);
		System.out.println(String.join(" ", result));
//		System.out.println(result);
	}
}
