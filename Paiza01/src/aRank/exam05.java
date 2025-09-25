package aRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class exam05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] nx = str2int(sc.nextLine().split(" "));
//		List<Integer> price = new ArrayList<>();
		int[] price = new int[nx[0]];
		int kinds = 0;
		int min = Integer.MAX_VALUE;
		int money = nx[1];
		int tmoney = money;
		
		for(int i=0; i<nx[0]; i++) {
			int tmp = Integer.parseInt(sc.nextLine());
			price[i] = tmp;
		}
//		Collections.sort(price);
		Arrays.sort(price);
//		
		for(int i=0; i<nx[0]; i++) {
			if(tmoney - price[i] >= 0) {
				tmoney -= price[i];
				kinds++;
			}
		}
//		System.out.println(kinds);
//		int[] nums = {1, 2, 3, 4};
		for(int i=0; i<=nx[0]; i++) {
			List<List<Integer>> result = new ArrayList<>();
//	        int r = 1; // 조합의 크기
	        combine(price, kinds, 0, new ArrayList<>(), result);
	        
	        for(int j=0; j<result.size(); j++) {
	        		int sum = 0;
	        		for(int l=0; l<result.get(j).size(); l++) {
	        			sum += result.get(j).get(l);
	        		}
	        		int turi = money - sum;
	        		if(turi >= 0 && min > turi) {
	        			min = turi;
	        		}
	        }
		}
		System.out.println(min);
//        List<List<Integer>> result = new ArrayList<>();
//        int r = 1; // 조합의 크기
//        combine(price, r, 0, new ArrayList<>(), result);
//        System.out.println(result);
    }

    private static void combine(int[] nums, int r, int start, List<Integer> current, List<List<Integer>> result) {
        if (current.size() == r) {
            result.add(new ArrayList<>(current));
            return;
        }
        for (int i = start; i < nums.length; i++) {
            current.add(nums[i]);
            combine(nums, r, i + 1, current, result);
            current.remove(current.size() - 1);
        }
	}
    
	static int[] str2int(String[] str) {
		int[] lst = new int[str.length];
		for(int i=0; i<str.length; i++) {
			lst[i] = Integer.parseInt(str[i]);
		}
		
		return lst;
	}
}
