package AOJ.IntroductionToProgramming;

import java.util.Scanner;

public class ITP13C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String[] inputNums = sc.nextLine().split(" ");
            int num1 = Integer.parseInt(inputNums[0]);
            int num2 = Integer.parseInt(inputNums[1]);

            if (num1 == 0 && num2 == 0) {
                break;
            }

            if (num2 > num1) {
                System.out.println(num1 + " " + num2);
            } else {
                System.out.println(num2 + " " + num1);
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
//        int a,b;
//
//        while(true){
//            a = sc.nextInt();
//            b = sc.nextInt();
//
//            if(a == 0 && b == 0)break;
//
//            System.out.printf("%d %d\n", Math.min(a, b),Math.max(a, b));
//        }
//
//    }
//}
