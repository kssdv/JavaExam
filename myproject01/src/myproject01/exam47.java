package myproject01;

import java.util.Scanner;

public class exam47 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        String[] line = new String[num];
        
        for(int i=0; i<num; i++) {
            line[i] = sc.nextLine();
        }
        for(int i=num-1; i>=0; i--) {
            System.out.println(line[i]);
        }
	}
}
