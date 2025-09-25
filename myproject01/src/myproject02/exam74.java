package myproject02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exam74 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> lst = new ArrayList<>();
		List<String> res = new ArrayList<>();
		String[] num = sc.nextLine().split(" ");
		// start_point
		int point = Integer.parseInt(num[2]); 
		
		for(int i=0; i<Integer.parseInt(num[0]); i++) {
			String t = sc.nextLine();
			lst.add(t);
		}
		int idx1 = Integer.parseInt(num[2])-1;
		res.add(lst.get(idx1).split(" ")[0]);
		
		for(int i=0; i<Integer.parseInt(num[1]); i++) {
			// 1 or 2のidx保存
			int temp = Integer.parseInt(sc.nextLine());
			// pの行を選択 -> idx抽出
			idx1 = Integer.parseInt(lst.get(idx1)
					.split(" ")[temp])-1;
			res.add(lst.get(idx1).split(" ")[0]);
		}
		System.out.println(String.join("", res));
	}
}
