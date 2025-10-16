package tip;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class exam05 {

	public static void main(String[] args) {
		// Set<int[]> set = new Set<>(); 이런식으로 사용이 불가하여 아래와 같이 대체하여 사용한다.
		
		Set<List<Integer>> set = new HashSet<>();
		
		int[] arr1 = {1,2,3};
		int[] arr2 = {4,5,6};
		int[] arr3 = {1,2,3};
		
		//1. Arrays.stream(arr1) -> int[] 배열을 IntStream 으로 변환
		//2. .boxed() -> IntStream을 Stream<Integer>로 변환
		//3. .collect(Collectors.toList()) -> Stream<Integer>의 모든 요소를 모아서 List<Integer>로 변환
		set.add(Arrays.stream(arr1).boxed().collect(Collectors.toList()));
		set.add(Arrays.stream(arr2).boxed().collect(Collectors.toList()));
		set.add(Arrays.stream(arr3).boxed().collect(Collectors.toList()));
		
		System.out.println("Setの長さ: " + set.size());
		
		//Set 内容出力
		for(List<Integer> list : set) {
			System.out.println(list);
		}
	}

}
