package exmethod;

import java.util.HashMap;
import java.util.Map;

public class exam03 {
	// Mapをループする方法

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
        map.put(1, "田中");
        map.put(3, "鈴木");
        map.put(5, "山田");

        for(Integer key : map.keySet()) {
        		System.out.println(key);
        }
		System.out.println("---------------");
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("Apple", 100);
        map1.put("Banana", 200);
        map1.put("Cherry", 300);

        for (Map.Entry<String, Integer> entry : map1.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        System.out.println("------------------");
        Map<String, Integer> map2 = new HashMap<>();
        map2.put("Apple", 100);
        map2.put("Banana", 200);
        map2.put("Cherry", 300);

        map2.forEach((key, value) -> {
            System.out.println("Key: " + key + ", Value: " + value);
        });
	}

}
