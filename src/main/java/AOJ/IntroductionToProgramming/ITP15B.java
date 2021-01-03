package AOJ.IntroductionToProgramming;

import java.util.Scanner;

public class ITP15B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int H = sc.nextInt();
            int W = sc.nextInt();

            if (H == 0 && W == 0) {
                break;
            }

            for (int i = 0; i < H; i++) {
                for (int j = 0; j < W; j++) {
                    if (i == 0 || j == 0 || i == H - 1 || j == W - 1) {
                        System.out.print("#");
                    } else {
                        System.out.print(".");
                    }
                }
                System.out.println();
            }
            System.out.println();
        }
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
//        int H,W;
//        String work[] = new String[2];
//
//        while(true){
//
//            try {
//                work = br.readLine().split("[\\s]+");
//
//                if(work[0].equals("0") && work[1].equals("0"))break;
//
//                H = Integer.parseInt(work[0]);
//                W = Integer.parseInt(work[1]);
//
//                for(int col = 0; col < W; col++){
//                    System.out.printf("#");
//                }
//                System.out.printf("\n");
//
//                for(int row = 1; row <= H-2; row++){
//                    System.out.printf("#");
//                    for(int col = 1; col <= W-2; col++){
//                        System.out.printf(".");
//                    }
//                    System.out.printf("#\n");
//                }
//
//                for(int col = 0; col < W; col++){
//                    System.out.printf("#");
//                }
//                System.out.printf("\n\n");
//
//
//            } catch (IOException e) {
//
//                e.printStackTrace();
//            }
//        }
//    }
//}

// 参考コード2
//import java.util.*;
//        import java.lang.*;
//        import java.io.*;
//class Main {
//    public static void main (String[] args) {
//        Scanner sc = new Scanner(System.in);
//        while(true) {
//            int H = sc.nextInt();
//            int W = sc.nextInt();
//            if(H == 0 && W == 0) {
//                break;
//            }
//            for(int i = 0; i < H; ++i) {
//                for(int j = 0; j < W; ++j) {
//                    System.out.print((i == 0 || i == H - 1 || j == 0 || j == W - 1 ? "#" : "."));
//                }
//                System.out.println();
//            }
//            System.out.println();
//        }
//    }
//}