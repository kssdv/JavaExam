package aRank;

import java.util.Scanner;

public class exam04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] nk = str2int(sc.nextLine().split(" "));
		int[] lst = str2int(sc.nextLine().split(" "));
		int sum = 0;
		int max = 0;
		int idx = 0;
		int cnt = 0;
		
		for(int i=lst.length-1; i>=0+(nk[1]-1); i--) {
			if(i >= lst.length-1) {
				for(int j=i; j>i-nk[1]; j--) {
					sum += lst[j];
				}
			}else {
				sum -= lst[i+1];
				sum += lst[i-(nk[1]-1)];
			}
			if(max <= sum) {
				if(max < sum) {
					cnt = 0;
				}
				max = sum;
				idx = i;
				cnt++;
			}
		}
		System.out.println(cnt+" "+(idx-(nk[1]-1)+1));
	}
	static int[] str2int(String[] str) {
		int[] lst = new int[str.length];
		for(int i=0; i<str.length; i++) {
			lst[i] = Integer.parseInt(str[i]);
		}
		
		return lst;
	}
}
