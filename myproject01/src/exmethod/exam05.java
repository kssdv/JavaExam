package exmethod;

import java.util.Enumeration;
import java.util.Hashtable;

public class exam05 {

	public static void main(String[] args) {
		Hashtable<String, String> ht = new Hashtable<>();
		
		ht.put("a", "");
		ht.put("b", "");
		ht.put("c", "");
		
		ht.replace("b", "1");
		
		Enumeration<String> keys = ht.keys();
		
		while(keys.hasMoreElements()) {
			System.out.println(keys.nextElement());
		}
	}

}
