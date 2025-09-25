package bRank;

import java.util.Scanner;

public class exam78 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		double[][] coordinates = new double[n][2];
		double a = 0.0;
		double b = 0.0;
		double c = 0.0;
		
		for(int i=0; i<n; i++) {
			double[] tmp = str2double(sc.nextLine().split(" "));
			coordinates[i] = tmp;
		}
		
//		for(int i=0; i<coordinates.length-1; i++) {
//			for(int j=i+1; j<coordinates.length; j++) {
//				double[] res = lineEquation(coordinates[i][0], coordinates[i][1], coordinates[j][0], coordinates[j][1]);
////				System.out.printf("%f %f %f\n", res[0], res[1], res[2]);
//				
//				a = res[0];
//				b = res[1];
//				c = res[2];
//				double distance = Math.abs(a * coordinates[2][0] * coordinates[2][1]) / Math.pow((a*a + b*b), 0.5);
//				System.out.println(distance);
//				break;
//			}
//		}
//		
		double[] res = lineEquation(coordinates[0][0], coordinates[0][1], coordinates[1][0], coordinates[1][1]);
		a = res[0];
		b = res[1];
		c = res[2];
		double distance = 
				Math.abs(a * coordinates[2][0] + b * coordinates[2][1] + c) / Math.pow((a*a + b*b), 0.5);
		int cnt = 0;
		
		System.out.println(distance);
		
//		double[] res = lineEquation(coordinates[0][0], coordinates[0][1], coordinates[1][0], coordinates[1][1]);
//		System.out.printf("%f %f %f", res[0], res[1], res[2]);
		
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
