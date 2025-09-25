package bRank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exam60 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] xy = str2int(sc.nextLine().split(" "));
		int n = Integer.parseInt(sc.nextLine());
		int[][] lst = new int[n][2];
		double[] eu = new double[n];
		double[] man = new double[n];
		
		for(int i=0; i<n; i++) {
			lst[i] = str2int(sc.nextLine().split(" "));
		}
		
		for(int i=0; i<n; i++) {
			double tmp = euclideanDistance(xy[0], xy[1], lst[i][0], lst[i][1]);
			eu[i] = tmp;
		}
		min1to3(eu);
		
		for(int i=0; i<n; i++) {
			int tmp = (int) GetManhattan(xy[0], xy[1], lst[i][0], lst[i][1]);
			man[i] = tmp;
		}
		min1to3(man);
		
	}
	
	static void min1to3(double[] lst) {
		List<Integer> elist = new ArrayList<>();
		double max = 0;
		for(double i: lst) {
			if(max < i) max = i;
		}
		
		for(int j=0; j<3; j++) {
			int idx = 0;
			double min = max;
			for(int i=lst.length-1; i>=0; i--) {
				if(min >= lst[i] && !elist.contains(i)) {
					min = lst[i];
					idx = i;
				}
			}
			elist.add(idx);
		}
		System.out.printf("%d\n%d\n%d\n", elist.get(0)+1, elist.get(1)+1, elist.get(2)+1);
	}
	
	private static double euclideanDistance(int x1, int y1, int x2, int y2) {
		return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
	}
	
	static double GetManhattan (int x1, int y1, int x2, int y2) {
		double d = Math.abs(x1-x2)+Math.abs(y1-y2);
		return d;
	}
	
	private static int[] str2int(String[] str) {
		int[] lst = new int[str.length];
		for(int i=0; i<str.length; i++) {
			lst[i] = Integer.parseInt(str[i]);
		}
		
		return lst;
	}
}
