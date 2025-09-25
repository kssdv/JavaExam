package myproject01;

public class exam42 {
	public static void main(String[] args) {
		int num = 100;
		int[] lst = new int[num];
		lst[0] = 0;
		lst[1] = 1;
		
		for(int i=2; i<lst.length; i++) {
			lst[i] = lst[i-2] + lst[i-1];
		}
		printAll(lst);
	}
	
	public static void printAll(int[] lst) {
		for(int i=0; i<lst.length; i++) {
			System.out.println(lst[i]);
		}
	}
}
