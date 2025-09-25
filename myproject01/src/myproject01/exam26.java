package myproject01;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class exam26 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Set<Integer> a = new HashSet<>();
        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt());
        }

        Set<Integer> b = new HashSet<>();
        for (int i = 0; i < n; i++) {
            b.add(sc.nextInt());
        }

        TreeSet<Integer> union = new TreeSet<>();
        // φ ∪ A
        union.addAll(a);
        // A ∪ B
        union.addAll(b);

        int max = union.last();
        for (int x : union) {
            System.out.print(x);
            if (x < max) {
                System.out.print(" ");
            } else {
                System.out.println();
            }
        }
	}
}
