package bRank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exam84 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] nk = str2int(sc.nextLine().split(" "));
		int[] lst = str2int(sc.nextLine().split(" "));
		List<Integer> lst2 = new ArrayList<>();
		int n = nk[0];
		int k = nk[1];
		int cnt = 0;
		int sum = 0;
		
//		for(int i=0; i<n-k+1; i++) {
//			int tmp = 0;
//			for(int j=0; j<k; j++) {
//				tmp += lst[i + j];
//			}
////			lst2.add(lst[i] + lst[i+1] + lst[i+2]);
//			lst2.add(tmp);
//		}
		
//		for(int i=0; i<n-k+1; i++) {
		for(int i=0; i<n; i++) {
			sum += lst[i];
			if(i == k-1) {
				lst2.add(sum);
			}else if(i >= k) {
				sum -= lst[i-k];
				lst2.add(sum);
			}
			
		}
		
		for(int i=0; i<lst2.size(); i++) {
			System.out.print(i == 0 ? lst2.get(i)+"" : " "+lst2.get(i));
		}
	}
	
	static int[] str2int(String[] str) {
		int[] lst = new int[str.length];
		for(int i=0; i<str.length; i++) {
			lst[i] = Integer.parseInt(str[i]);
		}
		return lst;
	}
}
