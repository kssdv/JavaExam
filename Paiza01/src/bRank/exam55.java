package bRank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exam55 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String k32 = sc.nextLine();
		List<Integer> k8 = new ArrayList<>();
		int cnt = 0;
		
		for(int i=0; i<4; i++) {
			k8.add(Integer.parseInt(k32.substring(i*8, i*8+8)));
		}
		System.out.println(k8.stream().mapToInt(Integer::intValue).sum());
	}
}
