package myproject01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exam61 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = str2int(sc.nextLine().split(" "));
        List<Integer> lst = new ArrayList<>();
        
        for(int i=1; i<=num[0]; i++) {
        		lst.add(i);
        }
        
        for(int i=0; i<num[1]; i++) {
        		String cmd = sc.nextLine();
        		if(cmd.contains("swap")) {
        			int idx1 = Integer.parseInt(cmd.split(" ")[1]);
        			int idx2 = Integer.parseInt(cmd.split(" ")[2]);
        			swapAB(lst, idx1-1, idx2-1);
        		}else if(cmd.contains("reverse")) {
        			upsidedown(lst);
        		}else if(cmd.contains("resize")) {
        			int t = Integer.parseInt(cmd.split(" ")[1]);
        			lst = resize(lst, t);
        		}
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
    
    public static List<Integer> reverseList(List<Integer> lst) {
    		List<Integer> lst2 = new ArrayList<>();
    		
    		for(int i=lst.size()-1; i>=0; i--) {
    			lst2.add(lst.get(i));
    		}
    		return lst2;
    }

    public static void swapAB(List<Integer> lst, int a, int b){
		int t = lst.get(a);
		lst.set(a, lst.get(b));
		lst.set(b, t);    
    }
    
    public static int[] str2int(String[] str) {
		int[] lst = new int[str.length];
		for(int i=0; i<str.length; i++) {
			lst[i] = Integer.parseInt(str[i]);
		}
		return lst;
	}
}