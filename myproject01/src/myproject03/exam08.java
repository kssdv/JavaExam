package myproject03;

import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Scanner;
import java.util.Stack;

public class exam08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] snum = sc.nextLine().split(" ");
		Stack<Integer> stack = new Stack<>();
		Dictionary<Integer, Boolean> dictionary = new Hashtable<>();
		int[] lst = new int[Integer.parseInt(snum[0])];
		int startIdx = 0;
		
		for(int i=0; i<Integer.parseInt(snum[0]); i++) {
			int t = Integer.parseInt(sc.nextLine());
			lst[i] = t;
		}
		for(int j=0; j<Integer.parseInt(snum[1]); j++) {
			String cmd = sc.nextLine();
			if(cmd.equals("pop")) {
				startIdx++;
			}else if(cmd.equals("show")) {
				showList(lst, startIdx);
			}
		}
	}
	public static void showList(int[] lst, int startIdx){
		for(int i=startIdx; i<lst.length; i++) {
			System.out.println(lst[i]);
		}
	}
}
