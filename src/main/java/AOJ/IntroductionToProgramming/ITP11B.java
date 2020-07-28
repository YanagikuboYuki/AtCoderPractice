package AOJ.IntroductionToProgramming;

import java.util.Scanner;

public class ITP11B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println((int) Math.pow(num, 3));
    }
}

// 模範解答
//import java.util.Scanner;
//
//class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        System.out.println(n*n*n);
//    }
//}
