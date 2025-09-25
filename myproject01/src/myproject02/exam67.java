package myproject02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exam67 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] snum = sc.nextLine().split(" ");
		List<String> students = new ArrayList<>();
		
		for(int i=0; i<Integer.parseInt(snum[0]); i++) {
			students.add(sc.nextLine());
		}
		
//		int num = Integer.parseInt(sc.nextLine().split(" ")[0]);
		for(int i=0; i<Integer.parseInt(snum[1]); i++) {
			String[] temp = sc.nextLine().split(" ");
			String lastName = temp[1];
			int idx = Integer.parseInt(temp[0]);
			String data = students.get(idx-1);
			students.set(idx-1, changeName(data, lastName));
		}
		for(String s : students) {
			System.out.println(s);
		}
	}
	public static String changeName(String data, String lastName) {
		String[] temp =data.split(" ");
		temp[0] = lastName;
		data = String.join(" ", temp);
		
		return data;
	}
}
