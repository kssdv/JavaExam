//package myproject02;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//class Customer {
//
//    static int numOfLeft = 0;
//    int amount;
//
//    Customer() {
//        amount = 0;
//    }
//
//    void takeFood(int m) {
//        amount += m;
//    }
//
//    void takeSoftDrink(int m) {
//        amount += m;
//    }
//
//    void takeAlcohol(int m) {}
//
//    void takeAlcohol() {
//        takeAlcohol(500);
//    }
//
//    void left() {
//        numOfLeft++;
//    }
//}
//
//class Adult extends Customer {
//
//    boolean drunk;
//
//    Adult() {
//        super();
//        drunk = false;
//    }
//
//    void takeFood(int m) {
//        if (drunk) {
//            m -= 200;
//        }
//        super.takeFood(m);
//    }
//
//    void takeAlcohol(int m) {
//        drunk = true;
//        amount += m;
//    }
//}
//public class exam73 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//
//        int n = sc.nextInt();
//        int k = sc.nextInt();
//
//        ArrayList<Customer> customers = new ArrayList<>();
//
//        for (int i = 0; i < n; i++) {
//            int age = sc.nextInt();
//            if (age < 20) {
//                customers.add(new Customer());
//            } else {
//                customers.add(new Adult());
//            }
//        }
//
//        for (int i = 0; i < k; i++) {
//            int index = sc.nextInt() - 1;
//            String s = sc.next();
//
//            if (s.equals("0")) {
//                customers.get(index).takeAlcohol();
//            } else if (s.equals("A")) {
//                System.out.println(customers.get(index).amount);
//                customers.get(index).left();
//            } else {
//                int m = sc.nextInt();
//                if (s.equals("food")) {
//                    customers.get(index).takeFood(m);
//                } else if (s.equals("softdrink")) {
//                    customers.get(index).takeSoftDrink(m);
//                } else if (s.equals("alcohol")) {
//                    customers.get(index).takeAlcohol(m);
//                }
//            }
//        }
//
//        System.out.println(Customer.numOfLeft);
//	}
//}
