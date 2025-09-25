package bRank;

import java.util.Scanner;

public class exam26 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = str2int(sc.nextLine().split(" "));
		int n = num[0];
		int a = num[1];
		int b = num[2];
		
		System.out.println(main(n, a, b));
	}
	
	public static int main(int n, int a, int b) {
		if(n % a == 0 && n % b == 0) {
			return n / a < n / b ? n/a : n/b;
		}else if(n % a == 0 && n % b != 0) {
			return n / a;
		}else if(n % b == 0) {
			return n / b;
		}else {
			int t = n;
			int cnt = 0;
			int max = a > b ? a : b;
			int min = a < b ? a : b;
			while(t > 0) {
				t -= max < t ? max : min;
				cnt++;
			}
			if(t == 0) {
				return cnt;
			}else {
				return 0;
			}
		}
	}

	public static int[] str2int(String[] str) {
		int[] lst = new int[str.length];
		for(int i=0; i<str.length; i++) {
			lst[i] = Integer.parseInt(str[i]);
		}
		return lst;
	}
}
