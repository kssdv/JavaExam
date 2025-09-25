package bRank;

import java.util.Scanner;
// 絶対longタイプで1,000,000,000を超える数値もある
// int x, int y, long sum
// int MAX_VALUE: 2,147,483,647

public class exam36 {

	public static void main(String[] args) {
		var sc = new Scanner(System.in);
        
        var n = sc.nextInt();
        
        var nowIndex = 0;
        var t = new int[n];
        var x = new long[n];
        var y = new long[n];

        for (var i = 0; i < n; i++) {
            t[i] = sc.nextInt();
            y[i] = sc.nextLong();
            x[i] = sc.nextLong();
        }
        
        // tが0から100まで、tと同じ場合はそのまま出力
        for (var i = 0; i <= 100; i++) {
            if (i == t[nowIndex]) {
                System.out.println(y[nowIndex] + " " + x[nowIndex]);
                nowIndex++;
            } else {
                System.out.println(
                    (y[nowIndex - 1] + (i - t[nowIndex - 1]) * (y[nowIndex] - y[nowIndex - 1]) / (t[nowIndex] - t[nowIndex - 1]))
                    + " "
                    + (x[nowIndex - 1] + (i - t[nowIndex - 1]) * (x[nowIndex] - x[nowIndex - 1]) / (t[nowIndex] - t[nowIndex - 1])));
            }
        }
    }
}
