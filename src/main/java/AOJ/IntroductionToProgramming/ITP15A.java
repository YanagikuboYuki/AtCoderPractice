package AOJ.IntroductionToProgramming;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ITP15A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<int[]> numsList = new ArrayList<>();
        boolean excutive = true;
        // この中で処理をやってしまえばfor文一個減らせる。scの挙動勘違いしてた。sc.nextIntで毎回入力を求めるかと思ってた。
        while (excutive) {
            int[] nums = new int[2];
            nums[0] = sc.nextInt();
            nums[1] = sc.nextInt();
            numsList.add(nums);
            if (nums[0] == 0 && nums[1] == 0) {
                excutive = false;
            }
        }
        for (int i = 0; i < numsList.size(); i++) {
            int[] nums = numsList.get(i);
            for (int j = 0; j < nums[0]; j++) {
                for (int k = 0; k < nums[1]; k++) {
                    System.out.print("#");
                }
                System.out.println();
            }
            if (i != numsList.size() - 1) {
                System.out.println();
            }
        }
    }
}

// 参考コード1
//import java.io.BufferedReader;
//        import java.io.IOException;
//        import java.io.InputStreamReader;
//
//
//public class Main {
//
//    private static final int BIG_NUM  = 2000000000;
//
//    public static void main(String[] args) {
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        int H,W;
//
//        String work[] = new String[2];
//
//        while(true){
//
//            try {
//                work = br.readLine().split("[\\s]+");
//                if(work[0].equals("0") && work[1].equals("0"))break;
//
//                H = Integer.parseInt(work[0]);
//                W = Integer.parseInt(work[1]);
//
//                for(int row = 0; row < H; row++){
//                    for(int col = 0; col < W; col++){
//                        System.out.printf("#");
//                    }
//                    System.out.printf("\n");
//                }
//
//                System.out.printf("\n");
//
//            } catch (IOException e) {
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
//                    System.out.print("#");
//                }
//                System.out.println();
//            }
//            System.out.println();
//        }
//    }
//}