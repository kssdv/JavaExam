package sRank;

import java.util.HashSet;
import java.util.Scanner;

public class exam03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] grundy = new int[n+1];
		
		for(int x=2; x<n+1; x++) {
			HashSet<Integer> check = new HashSet<>();
			for(int i=0; i<x-1; i++) {
				check.add(grundy[i] ^ grundy[x-i-2]);
			}
			int ans = 0;
			while(true){
				if (!check.contains(ans)){
					grundy[x] = ans;
					break;
				}
				ans += 1;
			}
		}
		if(grundy[n] == 0) {
			System.out.println("paiza");
		}else {
			System.out.println("me");
		}
	}

}
