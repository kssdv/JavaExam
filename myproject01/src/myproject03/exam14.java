package myproject03;

import java.util.Arrays;
import java.util.Scanner;

public class exam14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] num = sc.nextLine().split(" ");
		String[] lst = new String[Integer.parseInt(num[0])];
		
		for(int i=0; i<Integer.parseInt(num[0]); i++) {
			String name = sc.nextLine();
			lst[i] = name;
		}
		Arrays.sort(lst);
		for(int i=0; i<Integer.parseInt(num[1]); i++) {
			String e = sc.nextLine();
			if(e.contains("join")) {
				String name = e.split(" ")[1];
				lst = Arrays.copyOf(lst, lst.length + 1);
				lst[lst.length-1] = name;
				Arrays.sort(lst);
			}else if(e.contains("leave")) {
				String name = e.split(" ")[1];
				for(int j=0; j<lst.length; j++) {
					if(name.equals(lst[j])) {
						lst[j] = lst[lst.length-1];
						lst = Arrays.copyOf(lst, lst.length - 1);
						break;
					}
				}
			}else if(e.contains("handshake")) {
				if(lst.length > 0) {
//					List<String> temp = Arrays.asList(lst);
//					Collections.sort(temp);
					Arrays.sort(lst);
					for(String s : lst) {
						System.out.println(s);
					}
				}
			}
		}
		
	}
}
