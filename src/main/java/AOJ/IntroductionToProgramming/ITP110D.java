package AOJ.IntroductionToProgramming;

import java.util.Scanner;

public class ITP110D {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] xn = new int[n];
            int[] yn = new int[n];
            for (int i = 0; i < n; i++) {
                xn[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                yn[i] = sc.nextInt();
            }
            double p1 = 0;
            double p2 = 0;
            double p3 = 0;
            double pm = -1;

            for (int i = 0; i < n; i++) {
                p1 += Math.abs(xn[i] - yn[i]);
                p2 += Math.pow(Math.abs(xn[i] - yn[i]), 2);
                p3 += Math.pow(Math.abs(xn[i] - yn[i]), 3);
                pm = Math.max(pm, Math.abs(xn[i] - yn[i]));
            }

            System.out.printf("%.10f\n", p1);
            System.out.printf("%.10f\n", Math.sqrt(p2));
            System.out.printf("%.10f\n", Math.cbrt(p3));
            System.out.printf("%.10f\n", pm);
        }
    }
}
