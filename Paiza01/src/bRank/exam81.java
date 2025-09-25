package bRank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exam81 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		double[][] coordinates = new double[n][2];
		List<Integer> idxs = new ArrayList<>();
		int min = Integer.MAX_VALUE;
		
		// 座標の保存
		for(int i=0; i<n; i++) {
			double[] tmp = str2double(sc.nextLine().split(" "));
			coordinates[i] = tmp;
		}
		// 点を通る線、その中でも正しい直線
		for(int i=0; i<n-1; i++) {
			for(int j=i+1; j<n; j++) {
				double[] abc = lineEquation(coordinates[i][0], coordinates[i][1], coordinates[j][0], coordinates[j][1]);
				List<Integer> tlst = new ArrayList<>();
				int cnt = 0;
				for(int l=0; l<n; l++) {
					double distance = calDistance(abc[0], abc[1], abc[2], coordinates[l][0], coordinates[l][1]);
					if(distance >= 2) {
						cnt++;
						tlst.add(l);
					}
				}
				if(min > cnt) {
					min = cnt;
					idxs = tlst;
				}
			}
		}
		if(idxs.size() > 0) {
			for(int i:idxs) {
				System.out.println(i+1);
			}
		}else {
			System.out.println("none");
		}
		
		
	}
	static double calDistance(double a, double b, double c, double x, double y) {
		double distance = 
				Math.abs(a * x + b * y + c) / Math.pow((a*a + b*b), 0.5);
		
		return distance;
	}
	
	static double[] lineEquation(double x1, double y1, double x2, double y2) {
			double[] dtmp ={(y2-y1), (-1)*(x2-x1), ((x2-x1)*y1-(y2-y1)*x1)}; 
			return dtmp;
	}
	
	static double[] str2double(String[] str) {
		double[] lst = new double[str.length];
		for(int i=0; i<str.length; i++) {
			lst[i] = Double.parseDouble(str[i]);
		}
		return lst;
	}
}
