package bRank;

import java.util.Scanner;

public class exam39 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		String s = sc.nextLine();
		
		for(int i=0; i<n; i++) {
			String v = sc.nextLine();
			if(s.equals(v)) {
				System.out.println("banned");
			}else {
				int halflen = v.length()%2 == 0 ? v.length()/2 : v.length()/2 + 1;
				if(s.length() < halflen) {
					System.out.println(v);
				// 前
				}else if(s.substring(0, halflen).equals(v.substring(0, halflen))) {
					String tmp = v.replace(v.substring(0, halflen), "x".repeat(halflen));
					System.out.println(tmp);
				// 後
//				}else if(s.substring(halflen, s.length()).equals(v.substring(halflen, v.length()))) {
				}else if(s.substring(v.length()%2==0? halflen : halflen - 1, s.length()).equals(v.substring(halflen, v.length()))) {
					String tmp = v.replace(v.substring(v.length()%2==0? halflen : halflen - 1, v.length()), "x".repeat(halflen));
					System.out.println(tmp);
				}else {
					System.out.println(v);
				}
			}
		}
	}
}
