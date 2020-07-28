package AOJ.IntroductionToProgramming;

import java.util.Scanner;

public class ITP11C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstNum = sc.nextInt();
        int secondNum = sc.nextInt();
        System.out.println(firstNum * secondNum + " " + 2 * (firstNum + secondNum));
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
//        System.out.printf("%d %d\n",a*b,2*(a+b));
//    }
//}
