package AOJ.IntroductionToProgramming;

import java.util.Scanner;

public class ITP15C {
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
                    System.out.print(i % 2 == j % 2 ? "#" : ".");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}

// 参考コード
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
//                StringBuilder ans = new StringBuilder();
//
//                for(int row = 0; row < H; row++){
//                    for(int col = 0; col < W; col++){
//                        if((row+col)%2 == 0){
//                            ans.append("#");
//                        }else{
//                            ans.append(".");
//                        }
//                    }
//                    ans.append("\n");
//                }
//
//                System.out.println(ans.toString());
//
//
//            } catch (IOException e) {
//
//                e.printStackTrace();
//            }
//        }
//    }
//}