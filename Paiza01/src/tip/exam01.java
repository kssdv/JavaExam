package tip;

import java.util.ArrayList;
import java.util.List;

public class exam01 {

	public static void main(String[] args) {
		int[] nums = {1, 2, 3};
        List<List<Integer>> result = new ArrayList<>();
        permute(nums, new ArrayList<>(), result);
        System.out.println(result);
    }

    private static void permute(int[] nums, List<Integer> current, List<List<Integer>> result) {
        if (current.size() == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }
        for (int num : nums) {
            if (!current.contains(num)) {
                current.add(num);
                permute(nums, current, result);
                current.remove(current.size() - 1);
            }
        }
	}

}
