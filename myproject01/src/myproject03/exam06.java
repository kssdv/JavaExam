package myproject03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class exam06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] snum = sc.nextLine().split(" ");
		List<Integer> lst = new ArrayList<>();
		Stack<Integer> stack = new Stack<>();
		
		for(int i=0; i<Integer.parseInt(snum[0]); i++) {
			int t = Integer.parseInt(sc.nextLine());
			Collections.reverse(stack);
			stack.add(t);
			Collections.reverse(stack);
		}
		for(int j=0; j<Integer.parseInt(snum[1]); j++) {
			String cmd = sc.nextLine();
			if(cmd.equals("pop")) {
//				reversePop(stack);
				stack.pop();
			}else if(cmd.equals("show")) {
				showStack(stack);
			}
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
