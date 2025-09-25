package myproject01;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class exam21 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());
		String[] array_str = sc.nextLine().split(" ");
		Integer[] array = new Integer[array_str.length];

		for(int i=0; i<array_str.length; i++) {
			array[i] = Integer.parseInt(array_str[i]);
		}
		Set<Integer> set = new HashSet<>(Arrays.asList(array));
        Integer[] result = set.toArray(new Integer[0]);

//        System.out.println(Arrays.toString(result));
        for(int i=0; i<result.length; i++) {
        		if(i==0) {
        			System.out.print(result[i]);
        		}else {
        			System.out.print(" "+result[i]);
        		}
        }
	}
}
