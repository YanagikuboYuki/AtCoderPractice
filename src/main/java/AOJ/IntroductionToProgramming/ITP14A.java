package AOJ.IntroductionToProgramming;

import java.util.Scanner;

public class ITP14A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.printf("%d %d %f", a / b, a % b, (double) a / (double) b);
    }
}

// 参考コード
//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//
//        System.out.printf("%d %d %.10f\n", a/b,a%b,(double)a/(double)b);
//    }
//}