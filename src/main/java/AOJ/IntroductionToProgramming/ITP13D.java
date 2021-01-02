package AOJ.IntroductionToProgramming;

import java.util.Scanner;

public class ITP13D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int count = 0;
        for (int i = a; a < b + 1; a++) {
            if (c % a == 0) {
                count++;
            }
        }
        System.out.println(count);
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
//        int c = sc.nextInt();
//
//        int ans = 0;
//
//        for(int i = a; i <= b; i++){
//            if(c%i == 0)ans++;
//        }
//
//        System.out.printf("%d\n",ans);
//    }
//}