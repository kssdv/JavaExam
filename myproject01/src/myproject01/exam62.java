package myproject01;

import java.util.ArrayList;
import java.util.List;

public class exam62 {

    public static void main(String[] args) {
        List<Integer> lst = new ArrayList<>();
        lst.add(5);
        lst.add(6);
        lst.add(7);
        lst.add(8);
        
        for(int i : lst) {
        		System.out.println(i);
        }
        swapAB(lst, 0, 1);
//        lst = upsidedown(lst);
//        lst = resize(lst, 2);
        System.out.println();
        for(int i : lst) {
	    		System.out.println(i);
	    }
    }
    
    public static List<Integer> resize(List<Integer> lst, int n) {
    		List<Integer> t = new ArrayList<>();
    		for(int i=0; i<n; i++) {
    			t.add(lst.get(i));
    		}
    		return t;
    }
    
    public static List<Integer> upsidedown(List<Integer> lst) {
    		List<Integer> t = new ArrayList<>();
    		for(int i=lst.size()-1; i>=0; i--) {
    			t.add(lst.get(i));
    		}
    		return t;
    }
    
    public static void swapAB(List<Integer> lst, int a, int b){
    		int t = lst.get(a);
    		lst.set(a, lst.get(b));
    		lst.set(b, t);    
    }
}