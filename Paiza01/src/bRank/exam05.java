// マップの書き換え・縦横Java編（paizaランクB相当）
// https://paiza.jp/works/mondai/b_rank_new_level_up_problems/b_rank_new_level_up_problems__get_upsidedown/edit?language_uid=java&t=ada40a804666ccb369e6c4c005ee7c2d
package bRank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.List;
import java.util.Scanner;

class yearNname{
	yearNname(){}
	int year;
	String name;
	
}
public class exam05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<yearNname> ynns = new ArrayList<>();
		Hashtable<Integer, String> hashtable = new Hashtable();
		int[] num = str2int(sc.nextLine().split(" "));
		String[] names = new String[num[0]];
		List<Integer> years = new ArrayList<>();
		
		for(int i=0; i<num[0]; i++) {
			String name = sc.nextLine();
			names[i] = name;
		}
		
		for(int i=0; i<num[1]; i++) {
			yearNname ynn = new yearNname();
			String[] temp = sc.nextLine().split(" ");
			int year = Integer.parseInt(temp[0]);
			years.add(year);
//			ynn.year = year;
//			ynn.name = temp[1];
//			ynns.add(ynn);
		}
		
		Collections.sort(years);
		int temp = 0;
		for(int i=1; i<years.size(); i++) {
			if(years.get(i-1) == years.get(i)) {
				System.out.println(years.get(i-1));
			}
			
		}
		
		years.forEach(year -> System.out.println(year));
		
//		for(int i=0; i<ynns.size()-1; i++) {
//			for(int j=i+1; j<ynns.size(); j++) {
//				if(ynns.get(i).year > ynns.get(j).year) {
//					yearNname temp = ynns.get(i);
//					ynns.set(i, ynns.get(j));
//					ynns.set(j, temp);
//				}
//			}
//		}
		
//		for(yearNname ynn : ynns) {
//			System.out.println("Year: "+ynn.year);
//		}
//		ynns.forEach(i -> System.out.println("year : "+i.year));
		
		System.out.println("end");
	}
	
	public static int[] str2int(String[] str) {
		int[] lst = new int[str.length];
		for(int i=0; i<str.length; i++) {
			lst[i] = Integer.parseInt(str[i]);
		}
		return lst;
	}

}
