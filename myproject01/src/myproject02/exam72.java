package myproject02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Customer{
	private String name;
	private int age;
	private int pay=0;
	private boolean waribiki=false;
	
	Customer (){}
	
	public String setName(String name) {
		this.name = name;
		return name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	public int getPay() {
		return pay;
	}
	public void setWaribiki(boolean waribiki) {
		this.waribiki = waribiki;
	}
	public boolean getWaribiki() {
		return waribiki;
	}
}
public class exam72 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] snum = sc.nextLine().split(" ");
		List<Customer> customers = new ArrayList<>();
		int num1 = Integer.parseInt(snum[0]);
		int num2 = Integer.parseInt(snum[1]);
		
		for(int i=0; i<num1; i++) {
			Customer c = new Customer();
			int age = Integer.parseInt(sc.nextLine());
			c.setAge(age);
			customers.add(c);
		}
		for(int i=0; i<num2; i++) {
			String[] receipt = sc.nextLine().split(" ");
			int cid = Integer.parseInt(receipt[0])-1;
			String menu = receipt[1];
			int pay = receipt.length <= 2 ? 500 : Integer.parseInt(receipt[2]);
			Customer c = customers.get(cid);
			
			if(menu.equals("alcohol")) {
				if(c.getAge() >= 20) {
					c.setPay(c.getPay()+pay);
					c.setWaribiki(true);
				}
			}else if(menu.equals("food")) {
				c.setPay(c.getPay() + (c.getWaribiki() ? c.getPay() + pay - 200 : c.getPay() + pay));
			}else if(menu.equals("softdrink")) {
				c.setPay(c.getPay() + pay);
			}else if(menu.equals("0")) {
				if(c.getAge() >= 20) {
					c.setPay(c.getPay() + 500);
					c.setWaribiki(true);
				}
			}
			customers.set(cid, c);
		}
		
		for(Customer c : customers) {
			System.out.println(c.getPay());
		}
	}
}
