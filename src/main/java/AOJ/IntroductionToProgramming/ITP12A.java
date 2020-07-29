package AOJ.IntroductionToProgramming;

import java.util.Scanner;

public class ITP12A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String conpare;
        if (a < b) {
            conpare = " < ";
        } else if (a > b) {
            conpare = " > ";
        } else {
            conpare = " == ";
        }

        System.out.println("a" + conpare + "b");
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
//
//        String relation;
//
//        if(a > b){
//            relation = ">";
//        }else if(a < b){
//            relation = "<";
//        }else{
//            relation = "==";
//        }
//
//        System.out.printf("a %s b\n", relation);
//    }
//}