package myproject02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Employee{
	String name;
	int number;
	
	public Employee() {}
	
	public int getNum(){
		return number;
	}
	public void setNum(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

public class exam69 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Employee> employees = new ArrayList<>();
		int n = Integer.parseInt(sc.nextLine());
		
		for(int i=0; i<n; i++) {
			String[] tlst = sc.nextLine().split(" ");
			if(tlst[0].equals("make")) {
				Employee e = new Employee();
				e.number = Integer.parseInt(tlst[1]);
				e.name = tlst[2];
				employees.add(e);
			}else if(tlst[0].equals("getnum")) {
				int t = Integer.parseInt(tlst[1]);
				System.out.println(employees.get(t-1).number);
			}else if(tlst[0].equals("getname")) {
				int t = Integer.parseInt(tlst[1]);
				System.out.println(employees.get(t-1).name);
			}else if(tlst[0].equals("change_name")) {
				Employee e = employees.get(Integer.parseInt(tlst[1])-1);
				e.setName(tlst[2]);
				employees.set(Integer.parseInt(tlst[1])-1, e);
			}else if(tlst[0].equals("change_num")) {
				Employee e = employees.get(Integer.parseInt(tlst[1])-1);
				e.setNum(Integer.parseInt(tlst[2]));
				employees.set(Integer.parseInt(tlst[1])-1, e);
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
