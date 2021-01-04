package AOJ.IntroductionToProgramming;

import java.util.Scanner;

public class ITP110B {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            int C = sc.nextInt();

            double h = b * Math.sin(Math.toRadians(C));
            double S = 0.5 * a * h;
            double c = Math.sqrt(a * a + b * b - 2 * a * b * Math.cos(Math.toRadians(C)));

            System.out.println(S);
            System.out.println(a + b + c);
            System.out.println(h);
        }
    }
}
