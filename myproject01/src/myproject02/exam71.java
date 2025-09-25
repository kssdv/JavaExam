package myproject02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//class Customer{
//	private String name;
//	private int age;
//	private int pay=0;
//	private boolean waribiki=false;
//	
//	Customer (){}
//	
//	public String setName(String name) {
//		this.name = name;
//		return name;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setAge(int age) {
//		this.age = age;
//	}
//	public int getAge() {
//		return age;
//	}
//	public void setPay(int pay) {
//		this.pay = pay;
//	}
//	public int getPay() {
//		return pay;
//	}
//	public void setWaribiki(boolean waribiki) {
//		this.waribiki = waribiki;
//	}
//	public boolean getWaribiki() {
//		return waribiki;
//	}
//}
public class exam71 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Customer> customers = new ArrayList<>();
		String[] num = sc.nextLine().split(" ");
		int res = 0;
		
		for(int i=0; i<Integer.parseInt(num[0]); i++) {
//			String[] temp = sc.nextLine().split(" ");
			int age = Integer.parseInt(sc.nextLine());
			Customer c = new Customer();
			c.setAge(age);
			customers.add(c);
		}
		for(int i=0; i<Integer.parseInt(num[1]); i++) {
			String[] temp = sc.nextLine().split(" ");
			Customer c = customers.get(Integer.parseInt(temp[0])-1);
			int t = 0;
			if(temp[1].equals("alcohol") && c.getAge() >= 20) {
				t = Integer.parseInt(temp[2]);
				c.setWaribiki(true);
			}else if(temp[1].equals("food")) {
				t = Integer.parseInt(temp[2]);
				if(c.getWaribiki()) t -= 200;
			}else if(temp[1].equals("softdrink")){
				t = Integer.parseInt(temp[2]);
			}
			t = c.getPay() + t;
			c.setPay(t);
			customers.set(Integer.parseInt(temp[0])-1, c);
		}
		for(Customer x : customers) {
			System.out.println(x.getPay());
		}
	}
}
