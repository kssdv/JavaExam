package myproject02;

import java.util.Scanner;

public class exam59 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] tags = sc.nextLine().split(" ");
		String str = sc.nextLine();
		String[] idxs_temp = sc.nextLine().split(" ");
		int[] idxs = {Integer.parseInt(idxs_temp[0]), Integer.parseInt(idxs_temp[1])};
		
//		String res = str.substring(idxs[0]-1 + (tags[0].length() + 1), idxs[1]-1 - (tags[1].length() + 1));
		String res = str.substring(idxs[0]-1 + (tags[0].length()), idxs[1]-1);
		
		int len = res.length();
		
		System.out.println(res.equals("") ? "<blank>" : res);
	}
}
