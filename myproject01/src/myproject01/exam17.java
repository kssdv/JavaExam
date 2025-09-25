package myproject01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exam17 {
	public static void main(String[] args) {
		class Product {
			String name;
			int price;
			public Product(String name, int price) {
				this.name = name;
				this.price = price;
			}
		}
		List<Product> products = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		String[] tmp = sc.nextLine().split(" ");
		for(int i=0; i<Integer.parseInt(tmp[0]); i++) {
			String[] temp = sc.nextLine().split(" ");
			Product prod = new Product(temp[0], Integer.parseInt(temp[1]));
			products.add(prod);
		}
		for(int i=0; i<Integer.parseInt(tmp[1]); i++) {
			boolean flag = true;
			String temp3 = sc.nextLine();
			for(int j = 0; j < products.size(); j++) {
				if(products.get(j).name.equals(temp3)) {
					System.out.println(products.get(j).price);
					flag = false;
				}
			}
			if(flag) {
				System.out.println("-1");
			}
		}
	}
}
