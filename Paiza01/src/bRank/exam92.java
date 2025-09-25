package bRank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exam92 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int[] nm = str2int(sc.nextLine().split(" "));
//		System.out.println(nm[0]+" "+nm[1]);
//		for(int i=0; i<nm[1]; i++) {
//			System.out.println(sc.nextLine());
//		}
		
		int n = Integer.parseInt(sc.nextLine());
//		int[] lst = str2int(sc.nextLine().split(" "));
		
//		System.out.println(cntZero(lst));
		
		int[] ab = str2int(sc.nextLine().split(" "));
		List<Integer> result = nextSeats(n, ab[0], ab[1]);
		for(int i=0; i<result.size(); i++) {
			if(i == 0) {
				System.out.print(result.get(i));
			}else {
				System.out.print(" "+result.get(i));
			}
		}
		
    }
	static List<Integer> nextSeats(int total, int people, int startSeat) {
		List<Integer> result = new ArrayList<>();
		int seatNum = startSeat;
		int idx = 0;
		
		for(int i=0; i<people; i++) {
//			if(seatNum + 1 > total) {
			if(seatNum > total) {
				seatNum = seatNum - total;
			}
//			else {
//				seatNum++;
//			}
			result.add(seatNum);
			seatNum++;
		}
		
		return result;
	}
	
	static int cntZero(int[] lst) {
		int sum = 0;
		for(int i : lst) {
			if(i == 0) {
				sum ++;
			}
		}
		return sum;
	}
	
	static int[] str2int(String[] str) {
		int[] lst = new int[str.length];
		for(int i=0; i<str.length; i++) {
			lst[i] = Integer.parseInt(str[i]);
		}
		return lst;
	}
}
