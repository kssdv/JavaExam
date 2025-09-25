package myproject01;

import java.util.Scanner;

public class exam27 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] line = sc.nextLine().split("");
		for(int i=0; i<line.length; i++) {
			if(line[i].equals(line[i].toLowerCase())) {
				line[i] = line[i].toUpperCase();
			}else {
				line[i] = line[i].toLowerCase();
			}
		}
		System.out.println(String.join("", line));
	}
}
