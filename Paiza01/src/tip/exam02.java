package tip;

import java.util.ArrayList;
import java.util.List;

public class exam02 {

	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 4};
        List<List<Integer>> result = new ArrayList<>();
        int r = 2; // 조합의 크기
        combine(nums, r, 0, new ArrayList<>(), result);
        System.out.println(result);
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

}
