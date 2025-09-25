package myproject01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exam63 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] line = sc.nextLine().split(" ");
		String cmd = "";
		List<Integer> lst = mklst(Integer.parseInt(line[0]));
		
		for(int i=0; i<Integer.parseInt(line[1]); i++) {
			cmd = sc.nextLine();
			if(cmd.contains("reverse")) {
				lst = reverse(lst);
			}else if(cmd.contains("resize")) {
				resize(lst, Integer.parseInt(cmd.split(" ")[1]));
			}else if(cmd.contains("swap")) {
				int a = Integer.parseInt(cmd.split(" ")[1]);
				int b = Integer.parseInt(cmd.split(" ")[2]);
				swap(lst, a-1, b-1);
			}
		}
		printLst(lst);
		
	}
	
	public static void printLst(List<Integer> lst) {
		for(int i : lst) {
			System.out.println(i);
		}
	}
	
	public static List<Integer> resize(List<Integer> lst, int a) {
		List<Integer> temp = new ArrayList<>();
		if(lst.size() > a) {
			for(int i=lst.size()-1; i>=a; i--) {
				lst.remove(i);
			}
		}
		return temp;
	}
	
	public static void swap(List<Integer> lst, int a, int b) {
		int temp = lst.get(a);
		lst.set(a, lst.get(b));
		lst.set(b, temp);
	}
	
	public static List<Integer> mklst(int a){
		List<Integer> lst = new ArrayList<>();
		for(int i=1; i<a + 1; i++) {
			lst.add(i);
		}
		return lst;
	}
	
	public static List<Integer> reverse(List<Integer> lst) {
		List<Integer> temp = new ArrayList<>();
		for(int i=lst.size()-1; i>=0; i--) {
			temp.add(lst.get(i));
		}
		
		return temp;
	}
}
