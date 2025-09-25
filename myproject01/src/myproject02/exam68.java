package myproject02;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;
import java.util.Scanner;

class student{
	String name;
	int number;
}

public class exam68 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		List<String> cmd = new ArrayList<>();
		Dictionary nums = new Hashtable();
		Dictionary names = new Hashtable();
		
		for(int i=0; i<n; i++) {
			String temp = sc.nextLine();
			cmd.add(temp);
		}
		
		for(String c : cmd) {
			if(c.contains("make")) {
				String[] clst = c.split(" ");
				nums.put(Integer.parseInt(clst[1]), names);
			}else if(c.contains("getnum")) {
				
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
