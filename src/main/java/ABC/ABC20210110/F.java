package ABC.ABC20210110;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class F {
    private static final Map<Long, Long> memo = new HashMap<>();

    private static long X;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        X = sc.nextLong();
        long Y = sc.nextLong();
        System.out.println(f(Y));
    }

    static private long f(long y) {
        long ans = Math.abs(X - y);
        if (y == 1) {
            return ans;
        }

        if (memo.containsKey(y)) {
            return memo.get(y);
        }

        if (y % 2 == 0) {
            ans = Math.min(f(y / 2) + 1, Math.abs(y - X));
        } else {
            ans = Math.min(Math.min(f(y + 1) + 1, f(y - 1) + 1), Math.abs(y - X));
        }
        memo.put(y, ans);
        return ans;
    }
}
