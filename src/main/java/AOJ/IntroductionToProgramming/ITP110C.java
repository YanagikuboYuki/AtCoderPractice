package AOJ.IntroductionToProgramming;

import java.util.Scanner;

public class ITP110C {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            while (true) {
                int n = sc.nextInt();
                if (n == 0) {
                    break;
                }
                int[] sn = new int[n];
                int sum = 0;
                for (int i = 0; i < n; i++) {
                    sn[i] = sc.nextInt();
                    sum += sn[i];
                }
                double m = (double) sum / (double) n;

                double snm = 0;
                for (int i = 0; i < n; i++) {
                    snm += Math.pow(sn[i] - m, 2);
                }
                double a = Math.sqrt(snm / n);
                System.out.println(a);
            }
        }
    }
}
