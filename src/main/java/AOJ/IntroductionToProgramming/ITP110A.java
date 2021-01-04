package AOJ.IntroductionToProgramming;

import java.util.Scanner;

public class ITP110A {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double x1 = sc.nextDouble();
            double y1 = sc.nextDouble();
            double x2 = sc.nextDouble();
            double y2 = sc.nextDouble();

            System.out.println(Math.sqrt(Math.pow(Math.abs(x2 - x1), 2) + Math.pow(Math.abs(y2 - y1), 2)));
        }
    }
}

// 参考コード
// 二乗すると-消えるから絶対値いらなかった。
//import java.util.*;
//class Main {
//    public static void main (String[] args) throws java.lang.Exception {
//        Scanner sc = new Scanner(System.in);
//        double x1 = sc.nextDouble(), y1 = sc.nextDouble(), x2 = sc.nextDouble(), y2 = sc.nextDouble();
//        System.out.printf("%.9f\n", Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2)));
//    }
//}