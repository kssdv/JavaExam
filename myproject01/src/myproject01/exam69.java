package myproject01;

import java.util.Scanner;

// a
// n%3==0
// Fizz

// b
// n%5==0
// Buzz

// a & b
// FizzBuzz
public class exam69 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String res = "";
		if(n % 3 == 0) {
			res += "Fizz";
		}else if(n % 5 == 0) {
			res += "Buzz";
		}else {
			res += n;
		}
		System.out.println(res);
	}
}
