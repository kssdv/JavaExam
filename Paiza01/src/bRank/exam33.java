package bRank;

import java.util.Scanner;

public class exam33 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		long[][] txy = new long[n][3];
		int xres = 0;
		int yres = 0;
		
		for(int i=0; i<n; i++) {
			long[] tmp = str2long(sc.nextLine().split(" "));
			txy[i][0] = tmp[0];
			txy[i][1] = tmp[1];
			txy[i][2] = tmp[2];
		}
		
		for(int i=1; i<txy.length; i++) {
			for(long j=txy[i-1][0]; j<txy[i][0]; j++) {
//				long xtmp = (txy[i-1][1] - txy[i][1])/(txy[i-1][0]-txy[i][0])*j;
//				long ytmp = (txy[i-1][2] - txy[i][2])/(txy[i-1][0]-txy[i][0])*j;
//				System.out.println(xtmp+" "+ytmp);
				System.out.println(xres+" "+yres);
				xres += (txy[i-1][1] - txy[i][1])/(txy[i-1][0]-txy[i][0]);
				yres += (txy[i-1][2] - txy[i][2])/(txy[i-1][0]-txy[i][0]);
				
			}
//			manualAbs(txy[i-1][0] - txy[i][0]);
		}
		System.out.println(txy[txy.length-1][1]+" "+txy[txy.length-1][2]);
	}
	public static long manualAbs(long n) {
		if(n >= 0) {
			return n;
		}else {
			return -n;
		}
	}
	
	public static long[] str2long(String[] str) {
		long[] lst = new long[str.length];
		for(long i=0; i<str.length; i++) {
			lst[(int) i] = Long.parseLong(str[(int) i]);
		}
		return lst;
	}
}
