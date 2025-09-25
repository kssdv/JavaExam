package exmethod;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class exam02 {
	// forEach()について
	// collection.forEach(action);
	// collection: 配列やList, Set, Mapなどのコレクション。
	// action: 各要素に対して実行する処理（ラムダ式やメソッド参照を使用）。

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        // forEachでキーと値を処理
        map.forEach((key, value) -> System.out.println(key + ": " + value));
        System.out.println("-------------------");
        
        // forEachにフィルタリングを追加
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        // 偶数のみを出力
        numbers.stream()
        		.filter(num -> num % 2 == 0)
        		.forEach(System.out::println);
        System.out.println("-------------");
        
        List<String> fruits = Arrays.asList("apple", "banana", "cherry");
        
//        fruits.stream()
//        	.map(String::toUpperCase)
//        	.forEach(System.out::println);
        
        List<String> upperCaseFruits = fruits.stream()
        .map(String::toUpperCase)
        .collect(Collectors.toList());
        
        System.out.println(upperCaseFruits);
        
	}

}
