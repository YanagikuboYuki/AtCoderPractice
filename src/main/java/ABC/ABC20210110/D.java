package ABC.ABC20210110;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class D {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            long N = sc.nextInt();
            long C = sc.nextInt();
            Map<Long, Long> event = new TreeMap<>();
            for (int i = 0; i < N; i++) {
                long a = sc.nextInt();
                long b = sc.nextInt();
                long c = sc.nextInt();

                event.put(a - 1, event.getOrDefault(a - 1, 0L) + c);
                event.put(b, event.getOrDefault(b, 0L) - c);
            }
            long sum = 0;
            long fee = 0;
            long prev = -1;
            for (Map.Entry<Long, Long> e : event.entrySet()) {
                long x = e.getKey();
                long y = e.getValue();
                if (prev != -1) {
                    sum += Math.min(C, fee) * (x - prev);
                }
                fee += y;
                prev = x;
            }

            System.out.println(sum);
        }
    }
}
