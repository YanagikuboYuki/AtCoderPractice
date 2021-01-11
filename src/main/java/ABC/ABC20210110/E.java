package ABC.ABC20210110;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class E {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int[] a = new int[N];
            for (int i = 0; i < N; i++) {
                a[i] = sc.nextInt();
            }

            Pair[] p = new Pair[M];
            for (int i = 0; i < M; i++) {
                int x = sc.nextInt() - 1;
                int y = sc.nextInt() - 1;
                p[i] = new Pair(x, y);
            }
            Arrays.sort(p, Comparator.comparing(Pair::getX));

            int[] dp = new int[N];
            Arrays.fill(dp, Integer.MAX_VALUE);
            for (int i = 0; i < M; i++) {
                dp[p[i].y] = Math.min(Math.min(dp[p[i].y], dp[p[i].x]), a[p[i].x]);
            }

            int ans = Integer.MIN_VALUE;
            for (int i = 1; i < N; i++) {
                ans = Math.max(a[i] - dp[i], ans);
            }
            System.out.println(ans);
        }
    }

    static class Pair {
        int x;

        int y;

        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }

        int getX() {
            return x;
        }
    }
}
