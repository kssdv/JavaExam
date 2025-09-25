package aRank;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Hashtable;
import java.util.List;
import java.util.Scanner;

class Person {
	Hashtable<Integer, Integer> rel = new Hashtable<>(); 
	Person(){}
	
}

public class exam08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Person> people = new ArrayList<>();
		List<Person> circle = new ArrayList<>();
		// N = 村人の人数、M = 友好関係の整数、A = ログが更新される回数
		int[] nmq = str2int(sc.nextLine().split(" "));
		for(int i=0; i<nmq[0]; i++) {
			Person person = new Person();
			people.add(person);
		}
		
		for(int i=0; i<nmq[1]; i++) {
			// ex. 1 2 1 = 「村人a_iと村人b_iの友好度はf_iである」
			int[] t = str2int(sc.nextLine().split(" "));
			people.get(t[0]-1).rel.put(t[1]-1, t[2]);
			people.get(t[1]-1).rel.put(t[0]-1, t[2]);
		}
		// 同好会に人が増える(+)、または減る(-) 住民番号 = ex) + 1, - 3
		for(int i=0; i<nmq[2]; i++) {
			String[] t = sc.nextLine().split(" ");
			if(t[0].equals("+")) {
				circle.add(people.get(Integer.parseInt(t[1])-1));
			}else if(t[0].equals("-")) {
				circle.remove(people.get(Integer.parseInt(t[1])-1));
			}
			
			if(circle.size() == 0 || circle.size() == nmq[0]) {
				System.out.println(0);
			}else {
				int max = maxRelationship(circle);
				System.out.println(max);
			}
		}
//		if(circle.size() == 0 || circle.size() == nmq[0]) {
//			System.out.println(0);
//		}else {
//			int max = maxRelationship(circle);
//			System.out.println(max);
//		}
	}
	static int[] str2int(String[] str) {
		int[] lst = new int[str.length];
		for(int i=0; i<str.length; i++) {
			lst[i] = Integer.parseInt(str[i]);
		}
		
		return lst;
	}
	static int maxRelationship(List<Person> circle) {
		int max = 0;
		// Get all values from the Hashtable
		for(Person person : circle) {
			Collection<Integer> values = person.rel.values();

	        // Print all values
	        for (Integer value : values) {
//	            System.out.println(value);
	            if(max < value) {
	            		max = value;
	            }
	        }
		}
        
		return max;
	}
}
