package myproject02;

import java.util.Scanner;

public class exam28 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long p = Integer.parseInt(sc.nextLine());
		long m = p * 2;
		long pDamage = 0;
		long mDamage = 0;
		long cnt = 0;
		long[] pDmg = {0, 0};
		long[] mDmg = {0, 0};
		
		while(p >= 0) {
			cnt++;
			
			if(cnt >= 3) {
				mDamage = pDmg[0] + pDmg[1];
				pDamage = pDmg[0]*2 + pDmg[1];
			}else {
				pDamage = 1;
				mDamage = 1;
			}
			pDmg[1] = pDmg[0];
			pDmg[0] = pDamage;
			mDmg[1] = mDmg[0];
			mDmg[1] = mDamage;
			
			p -= pDamage;
			m -= mDamage;
			System.out.println(p);
			System.out.println(m);
			System.out.println("---------------------");
		}
		System.out.println(cnt);
	}
	
	public static int[] str2int(String[] slst) {
		int[] lst = new int[slst.length];
		for(int i=0; i<slst.length; i++) {
			lst[i] = Integer.parseInt(slst[i]);
		}
		
		return lst;
	}
}


