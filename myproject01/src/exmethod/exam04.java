package exmethod;

import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class exam04 {

	public static void main(String[] args) {
		LinkedHashMap<String, Integer> dic = new LinkedHashMap<>();
		
		Hashtable<Integer, String> hashtable = new Hashtable();
		
		hashtable.put(7583, "nana");
		hashtable.put(463, "nana");
		hashtable.put(7485, "nana");
		// TreeMapに変換してキーをソート
		TreeMap<Integer, String> sortedMap = new TreeMap<>(hashtable);
		
		System.out.println(hashtable.size());
		// ソートされた結果を表示
        sortedMap.forEach((key, value) -> System.out.println(key + ": " + value));
	}

}
