package myproject01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class exam23 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());
		String[] array = sc.nextLine().split(" ");
		List<String> line = new ArrayList<>(Arrays.asList(array));
		line.remove(2);
		line.remove(1);
		
		System.out.println(line);
	}
}
