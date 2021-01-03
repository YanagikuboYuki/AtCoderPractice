package AOJ.IntroductionToProgramming;

import java.util.Scanner;

public class ITP17A {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int m, f, r;
            for (int i = 0; i < 50; i++) {
                m = sc.nextInt();
                f = sc.nextInt();
                r = sc.nextInt();

                if (m == -1 && f == -1 && r == -1) {
                    break;
                }

                int mfSum = m + f;
                if (m == -1 || f == -1) {
                    System.out.println("F");
                } else if (mfSum >= 80) {
                    System.out.println("A");
                } else if (65 <= mfSum) {
                    System.out.println("B");
                } else if (50 <= mfSum) {
                    System.out.println("C");
                } else if (30 <= mfSum) {
                    if (r >= 50) {
                        System.out.println("C");
                    } else {
                        System.out.println("D");
                    }
                } else {
                    System.out.println("F");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

// 参考コード
// 結果を変数に入れて、最後に出力すればよかった
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args){
//        Scanner scan=new Scanner(System.in);
//        while(true){
//            int m=scan.nextInt();
//            int f=scan.nextInt();
//            int r=scan.nextInt();
//            if(m<0&&f<0&&r<0)break;
//            String ans;
//            if(m<0||f<0)ans="F";
//            else if(m+f>=80)ans="A";
//            else if(m+f>=65)ans="B";
//            else if(m+f>=50)ans="C";
//            else if(m+f>=30){
//                if(r>=50)ans="C";
//                else ans="D";
//            }
//            else ans="F";
//            System.out.println(ans);
//        }
//        scan.close();
//    }
//}