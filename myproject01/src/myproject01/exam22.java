package myproject01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class exam22 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());
		String[] str1 = sc.nextLine().split(" ");
		Integer[] array = new Integer[str1.length];
		for(int i=0; i<str1.length; i++) {
			array[i] = Integer.parseInt(str1[i]);
		}
		List<Integer> result = new ArrayList<>(Arrays.asList(array));
		List<Integer> rmIdx = new ArrayList<>(); 
		
		for(int i=0; i<array.length; i++) {
			for(int j=i + 1; j<array.length; j++) {
//			for(int j=array.length; j>i+1; j--) {
				if(array[i] == array[j] && !rmIdx.contains(j)) {
//					result.remove(j);
					rmIdx.add(j);
				}
			}
		}
//		System.out.println("result : "+result);
//		System.out.println("rmIdx : "+rmIdx);
		for(int i=rmIdx.size()-1; i>=0; i--) {
//			System.out.println("rmIdx.get("+i+") : "+rmIdx.get(i));
			int tmp = rmIdx.get(i);
			result.remove(tmp);
		}
		
//		System.out.println("--------------------");
		for(int i=0; i<result.size(); i++) {
			if(i == 0) {
				System.out.print(result.get(i));
			}else {
				System.out.print(" "+result.get(i));
			}
		}
	}
}
