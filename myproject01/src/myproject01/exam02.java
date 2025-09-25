package myproject01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exam02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		StringJoiner sj = new StringJoiner();
		List<String> lines = new ArrayList<>();
		String[] line = "994 267 101 579 874 986 32 528 253 822".split(" ");
		for(int i=0; i<line.length; i++) {
			lines.add(line[i]);
		}
		System.out.println(String.join(",", line));
		System.out.println(String.join(",", lines));
	}

}
