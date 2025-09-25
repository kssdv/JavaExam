package myproject01;

import java.util.Scanner;

public class exam64 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        boolean flag = true;
        for(int i=0; i<Integer.parseInt(line); i++) {
            String temp = sc.nextLine();
            if(Integer.parseInt(temp) == 0) {
                flag = false;
            }
        }
        System.out.println(flag ? "YES" : "NO");
	}

}
