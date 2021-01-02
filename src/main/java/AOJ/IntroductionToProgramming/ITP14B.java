package AOJ.IntroductionToProgramming;

import java.util.Scanner;

public class ITP14B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double r = sc.nextDouble();

        System.out.printf("%f %f", r * r * Math.PI, 2 * r * Math.PI);
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
//        double r = sc.nextDouble();
//
//        System.out.printf("%.10f %.10f\n",r*r*Math.PI,(2*r)*Math.PI);
//    }
//}