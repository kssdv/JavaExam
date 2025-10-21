package aRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class exam74 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        long k = Long.parseLong(st.nextToken());
        int[] a = new int[n];
        st = new StringTokenizer(br.readLine());

        boolean hasZero = false;
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
            if (a[i] == 0) {
                hasZero = true;
            }
        }

        if (k == 0) {
            System.out.println(hasZero ? 1 : 0);
            return;
        }

        int start = 0;
        long product = 1;
        int minLength = Integer.MAX_VALUE;

        for (int end = 0; end < n; end++) {
            if (a[end] == 0) {
                start = end + 1;
                product = 1;
                continue;
            }

            product *= a[end];

            // --- 여기가 수정된 부분 ---
            while (product >= k && start <= end) {
                minLength = Math.min(minLength, end - start + 1);
                
                // start가 end를 넘어가기 전에 나누기 연산을 수행해야 함
                if (start <= end) {
                     product /= a[start];
                }
                start++;
            }
        }

        if (minLength == Integer.MAX_VALUE) {
            System.out.println(0);
        } else {
            System.out.println(minLength);
        }
    }
}