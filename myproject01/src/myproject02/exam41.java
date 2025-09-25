package myproject02;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class exam41 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int first = Integer.parseInt(sc.nextLine());
		int[] adjuacents = {first-1, first+1};
		int[] seconds = new int[9];
		int[] thirds = new int[90];
		
		// second
		for(int i=0; i<9; i++) {
			seconds[i] = Integer.parseInt((10+i)+(first+"").substring(2));
		}
		// third
		for(int i=0; i<90; i++) {
			thirds[i] = Integer.parseInt((100+i)+(first+"").substring(3));
		}
		
		int num = Integer.parseInt(sc.nextLine());
		LinkedHashMap<Integer, String> dic = new LinkedHashMap<>();
		int[] lst = new int[num];
		for(int i=0; i<num; i++) {
			int temp = Integer.parseInt(sc.nextLine());
			lst[i] = temp;
			// 一等
			if(first == temp) {
				dic.put(temp, "first");
			// 前後賞
			}else if(first+1 == temp || first-1 == temp) {
				dic.put(temp, "adjacent");
			// 二等
//			}else if((first+"").substring(2).equals((temp+"").substring(2))) {
			}else if(isContain(seconds, temp)) {
				dic.put(temp, "second");
			// 三等
			}else if(isContain(thirds, temp)) {
				dic.put(temp, "third");
			// 外れ
			}else {
				dic.put(temp, "blank");
			}
		}
		for(int i : lst) {
			System.out.println(dic.get(i));
		}
	}
	
	public static boolean isContain(int[] second, int a) {
		boolean flag = false;
		for(int i : second) {
			if(i == a) flag = true;
		}
		return flag;
	}
}


