package AOJ.IntroductionToProgramming;

import java.util.Scanner;

public class ITP14C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean excute = true;
        while (excute) {
            int a = sc.nextInt();
            String op = sc.next();
            int b = sc.nextInt();

            switch (op) {
                case "+":
                    System.out.println(a + b);
                    break;
                case "-":
                    System.out.println(a - b);
                    break;
                case "*":
                    System.out.println(a * b);
                    break;
                case "/":
                    System.out.println(a / b);
                    break;
                default:
                    excute = false;
                    break;
            }
        }
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
//        while(true){
//
//            int a = sc.nextInt();
//            String op = sc.next();
//            int b = sc.nextInt();
//
//            if(op.equals("?"))break;
//
//            int ans = 0;
//
//            switch(op){
//                case "+":
//                    ans = a+b;
//                    break;
//                case "-":
//                    ans = a-b;
//                    break;
//                case "*":
//                    ans = a*b;
//                    break;
//                case "/":
//                    ans = a/b;
//                    break;
//            }
//
//            System.out.println(ans);
//        }
//    }
//}