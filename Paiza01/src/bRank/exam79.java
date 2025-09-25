package bRank;

import java.util.Scanner;

public class exam79 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		double[][] coordinates = new double[n][2];
		double a = 0.0;
		double b = 0.0;
		double c = 0.0;
		int cnt = 0;
		
		for(int i=0; i<n; i++) {
			double[] tmp = str2double(sc.nextLine().split(" "));
			coordinates[i] = tmp;
		}
		
		
		double[] res = lineEquation(coordinates[0][0], coordinates[0][1], coordinates[1][0], coordinates[1][1]);
		a = res[0];
		b = res[1];
		c = res[2];
		
		for(int i=2; i<n; i++) {
//			double[] tmp = str2double(sc.nextLine().split(" "));
			double t = calDistance(a, b, c, coordinates[i][0], coordinates[i][1]);
			if(t >= 2) {
				cnt++;
			}
		}
		System.out.println(cnt);
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
