package myproject01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exam12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> line = new ArrayList<>();
		int num1 = 0;
		int num2 = 0;
		if(true) {
			String[] temp = sc.nextLine().split(" ");
			num1 = Integer.parseInt(temp[0]);
			num2 = Integer.parseInt(temp[1]);
		}
		String[] temp = sc.nextLine().split(" ");
		for(int i=0; i<temp.length; i++) {
			line.add(temp[i]);
		}
		
		for(int i=0; i<num2; i++) {
			String[] tmp = sc.nextLine().split(" ");
			if(tmp[0].equals("0")) {
				line.add(tmp[1]);
			} else if(tmp[0].equals("1")) {
				line.remove(line.size() - 1);
			} else if(tmp[0].equals("2")) {
				System.out.println(String.join(" ", line));
			}
		}
	}

}
