package bRank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exam42 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int[] cups = new int[n];
		int sum = 0;
		
		for(int i=0; i<n; i++) {
			int tmp = sc.nextInt();
			cups[i] = tmp;
		}
		
		List<Integer> result = findClosestCombination(cups, x);
//        System.out.println("最も近い組み合わせ: " + result);

		for(int i : result) {
			sum += i;
		}
		System.out.println(sum);
       
    }

    public static List<Integer> findClosestCombination(int[] numbers, int target) {
        List<Integer> bestCombination = new ArrayList<>();
        int closestSum = 0;

        int n = numbers.length;
        int totalCombinations = 1 << n; // 2^nの組み合わせを生成

        for (int i = 0; i < totalCombinations; i++) {
            List<Integer> currentCombination = new ArrayList<>();
            int currentSum = 0;
            
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) { // ビットマスクで選択
                    currentCombination.add(numbers[j]);
                    currentSum += numbers[j];
                }
            }
            
            if (currentSum <= target && currentSum > closestSum) {
                closestSum = currentSum;
                bestCombination = new ArrayList<>(currentCombination);
            }
        }

        return bestCombination;
	}
}
