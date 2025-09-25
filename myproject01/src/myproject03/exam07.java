package myproject03;

import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public class exam07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> stack = new Stack<>();
		stack.add(1);
		stack.add(2);
		stack.add(3);
		reversePop(stack);
		stack.add(4);
		
		for(int i : stack) {
			System.out.println(i);
		}
	}
	
	public static Stack<Integer> reversePop(Stack<Integer> stack) {
		Collections.reverse(stack);
		stack.pop();
		Collections.reverse(stack);
		
		return stack;
	}
	public static void showStack(Stack<Integer> stack){
		for(int i : stack) {
			System.out.println(i);
		}
	}

}
