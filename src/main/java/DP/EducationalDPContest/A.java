package DP.EducationalDPContest;

import java.util.Scanner;

/**
 * https://atcoder.jp/contests/dp/tasks/dp_a
 */
public class A {
    private static final int INF = 1000000000;

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int[] dp = new int[N];
            int[] h = new int[N];
            for (int i = 0; i < N; i++) {
                h[i] = sc.nextInt();
            }
            for (int i = 0; i < N; i++) {
                dp[i] = INF;
            }

            dp[0] = 0;

            for (int i = 1; i < N; i++) {
                if (dp[i] > dp[i - 1] + Math.abs(h[i] - h[i - 1])) {
                    dp[i] = dp[i - 1] + Math.abs(h[i] - h[i - 1]);
                }
                if (i > 1) {
                    if (dp[i] > dp[i - 2] + Math.abs(h[i] - h[i - 2])) {
                        dp[i] = dp[i - 2] + Math.abs(h[i] - h[i - 2]);
                    }
                }
            }

            System.out.println(dp[N - 1]);
        }
    }
}
