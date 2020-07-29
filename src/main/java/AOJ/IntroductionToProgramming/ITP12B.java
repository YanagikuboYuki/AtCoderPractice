package AOJ.IntroductionToProgramming;

import java.util.Scanner;

public class ITP12B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        String answer = a < b && b < c ? "Yes" : "No";
        System.out.println(answer);
    }
}

// 参考コード
//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) {
//
//
//        Scanner sc = new Scanner(System.in);
//
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//
//        if(a < b && b < c){
//            System.out.printf("Yes\n");
//        }else{
//            System.out.printf("No\n");
//        }
//    }
//}