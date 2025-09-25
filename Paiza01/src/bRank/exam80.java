package bRank;

import java.util.Scanner;

public class exam80 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		double[][] coordinates = new double[n][2];
		int min = n;
		double[] mline = new double[3];
//		List<Integer> people = new ArrayList<Integer>();
//		List<Integer> list = new ArrayList<>();
		int[] people = new int[n];
		
		// x, yのデータ保存
		for(int i=0; i<n; i++) {
			coordinates[i] = str2double(sc.nextLine().split(" "));
		}
		// a, b, cのデータの保存
		for(int i=0; i<n-1; i++) {
			int[] idxs = new int[2];
//			int cnt = 0;
			
			for(int j=i+1; j<n; j++) {
				double[] res = lineEquation(coordinates[i][0], coordinates[i][1], coordinates[j][0], coordinates[i][1]);
//				a = res[0], b = res[1], c = res[2];
//				int idx = 0;
//				idx = j + 1 >= n ? j + 1 - n : j + 1;
//				double distance = calDistance(res[0], res[1], res[2], coordinates[idx][0], coordinates[idx][1]);
//				if(distance >= 2) {
//					cnt++;
//					System.out.println(j+1);
//				}
				int cnt = 0;
				for(int l=0; l<n; l++) {
					if(l != i && l != j) {
						double distance = calDistance(res[0], res[1], res[2], coordinates[l][0], coordinates[l][1]);
						if(distance >= 2) {
							cnt++;
//							list.add(l);
							people[l] = l+1;
						}
					}
				}
				if(min > cnt) {
					min = cnt;
					mline = res;
				}else {
//					list = Collections.emptyList();
					for(int f=0; f<people.length; f++) {
						people[f] = 0;
					}
				}
			}
		}
		for(int i : people) {
			System.out.println(i);
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
