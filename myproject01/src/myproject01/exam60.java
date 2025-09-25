package myproject01;

import java.util.Scanner;

public class exam60 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int f = sc.nextInt();

        int[] a = new int[k];
        for (int i = 0; i < k; i++) {
            a[i] = sc.nextInt();
        }

        boolean[] linedUp = new boolean[n];
        for (int i = f; i < k; i++) {
            if (linedUp[a[i] - 1]) {
                continue;
            }
            System.out.println(a[i]);
            linedUp[a[i] - 1] = true;
        }
    }
}