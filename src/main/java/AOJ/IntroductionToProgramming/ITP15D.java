package AOJ.IntroductionToProgramming;

import java.util.Scanner;

public class ITP15D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 3; i <= n; i++) {
            if (i % 3 == 0 || String.valueOf(i).contains("3")) {
                System.out.print(" " + i);
            }
        }
        System.out.println();
    }
}

// 参考コード1
//import java.io.BufferedReader;
//        import java.io.IOException;
//        import java.io.InputStreamReader;
//
//public class Main {
//
//    public static final int BIG_NUM  = 2000000000;
//    public static final int MOD  = 1000000007;
//
//    public static void main(String[] args) {
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        try {
//            int N = Integer.parseInt(br.readLine());
//
//            int x;
//
//            for(int i = 1; i <= N; i++)
//            {
//                if(i%3 == 0){
//                    System.out.printf(" %d",i);
//                }else{
//                    x = i;
//                    do{
//                        if(x%10 == 3){
//                            System.out.printf(" %d",i);
//                            break;
//                        }
//                        x /=10;
//                    }while(x != 0);
//                }
//            }
//            System.out.printf("\n");
//
//        } catch (NumberFormatException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}

// 参考コード2
//import java.util.Scanner;
//
//public class Main{
//    public static void main(String args[]){
//        Scanner sc=new Scanner(System.in);
//        int i=1,n=sc.nextInt();
//        while(i<=n){
//            int x=i;
//            if(x%3==0){
//                System.out.printf(" %d",i);
//            }else{
//                while(x>=1){
//                    if(x%10==3){
//                        System.out.printf(" %d",i);
//                        break;
//                    }
//                    x/=10;
//                }
//            }
//            i++;
//        }
//        System.out.printf("\n");
//    }
//};