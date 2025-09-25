package myproject02;

import java.util.Scanner;

public class exam02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		int cnt = 0;
		for(int i=2; i<=n; i++) {
			if(isPrime(i)) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
	
	public static int[] pList(int n) {
		String t = "";
		for(int i=2; i<=n; i++) {
			if(i == 2) {
				t += isPrime(i);
			}else {
				t += " "+isPrime(i);
			}
		}
		return str2int(t.split(" "));
	}
	
	public static boolean isPrime(int n) {
		boolean flag = true;
		if(n >= 2) {
			for(int i=2; i<n; i++) {
				if(n % i == 0) {
					flag = false;
					break;
				}
			}
		}else {
			flag = false;
		}
		
		return flag;
	}
	
	public static int[] str2int(String[] slst) {
		int[] lst = new int[slst.length];
		for(int i=0; i<slst.length; i++) {
			lst[i] = Integer.parseInt(slst[i]);
		}
		
		return lst;
	}
}
