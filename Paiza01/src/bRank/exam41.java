package bRank;

import java.util.Scanner;

public class exam41 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] lst = new int[n];
		int min = 0;
		int cnt = 0;
		// arraysにデータを保存
		for(int i=0; i<n; i++) {
			int tmp = sc.nextInt();
			lst[i] = tmp;
//			System.out.println(tmp);
		}
		
		// 二つの組み合わせの生成
		for(int i=0; i<lst.length; i++) {
			for(int j=i+1; j<lst.length; j++) {
				if(cnt <= 0) {
					min = minest(lst[i], lst[j]);
				}else {
					if(min > minest(lst[i], lst[j])) {
						min = minest(lst[i], lst[j]);
					}
				}
				cnt++;
			}
		}
		
		System.out.println(min);
	}
	
	public static int[] kinds(int a) {
		int[] numbers = new int[5];
		numbers[0] = a;
		numbers[1] = a + 1;
		numbers[2] = a - 1;
		numbers[3] = (Integer.parseInt(a + "1"));
		numbers[4] = (Integer.parseInt("1" + a));
		
		return numbers;
	}
	
	public static int minest(int num1, int num2) {
		int min = 0;
		int cnt = 0;
		int[] nlist1 = kinds(num1);
		int[] nlist2 = kinds(num2);
		for(int i=0; i<nlist1.length; i++) {
			for(int j=0; j<nlist2.length; j++) {
				if(cnt <= 0) {
					min = Math.abs(nlist1[i] - nlist2[j]);
				}else if(min > Math.abs(nlist1[i] - nlist2[j])) {
					min = Math.abs(nlist1[i] - nlist2[j]);
				}
				cnt++;
			}
		}
		
		return min;
	}
}
