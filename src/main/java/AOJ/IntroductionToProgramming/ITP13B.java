package AOJ.IntroductionToProgramming;

import java.util.Scanner;

public class ITP13B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 1;
        while (sc.hasNext()) {
            int num = sc.nextInt();
            System.out.println("Case " + i + ": " + num);
            if (num == 0 || i == 10000) {
                break;
            }
            i++;
        }
    }
}

// 参考コード
// 評価して変数に代入できる
//import java.util.Scanner;
//
//public class ITP13B {
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        int tmp,case_num = 1;
//
//        while((tmp = sc.nextInt()) != 0){
//            System.out.printf("Case %d: %d\n",case_num++, tmp);
//        }
//    }
//}
