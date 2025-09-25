package myproject02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student{
	String name;
	int number;
	
	public Student() {}
}

public class exam70 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		List<String> cmd = new ArrayList<>();
		List<Student> students = new ArrayList<>();
		
		for(int i=0; i<n; i++) {
			String t = sc.nextLine();
			if(t.contains("make")) {
				Student s = new Student();
				s.number = Integer.parseInt(t.split(" ")[1]);
				s.name = t.split(" ")[2];
				students.add(s);
			}else if(t.contains("getname")) {
				int tnum = Integer.parseInt(t.split(" ")[1]);
				System.out.println(students.get(tnum-1).name);
			}else if(t.contains("getnum")) {
				int tnum = Integer.parseInt(t.split(" ")[1]);
				System.out.println(students.get(tnum-1).number);
			}
		}
		
	}
	public static String changeName(String data, String lastName) {
		String[] temp =data.split(" ");
		temp[0] = lastName;
		data = String.join(" ", temp);
		
		return data;
	}
}
