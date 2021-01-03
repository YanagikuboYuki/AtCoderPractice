package AOJ.IntroductionToProgramming;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ITP16B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Map<String, List<Integer>> markNumMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String m = sc.next();
            int num = sc.nextInt();
            if (markNumMap.containsKey(m)) {
                markNumMap.get(m).add(num);
            } else {
                markNumMap.put(m, new ArrayList<Integer>() {
                    private static final long serialVersionUID = 3435574904294728134L;

                    {
                        add(num);
                    }
                });
            }
        }
        String[] marks = { "S", "H", "C", "D" };
        for (int i = 0; i < 4; i++) {
            String m = marks[i];
            for (int j = 1; j < 14; j++) {
                if (markNumMap.containsKey(m)) {
                    if (!markNumMap.get(m).contains(j)) {
                        System.out.println(m + " " + j);
                    }
                } else {
                    System.out.println(m + " " + j);
                }
            }
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
//    public static final int BIG_NUM = 2000000000;
//    public static final int MOD = 1000000007;
//
//    public static void main(String[] args) {
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        boolean[][] table = new boolean[4][14];
//        String mark[] = {"S","H","C","D"};
//
//        for(int row = 0; row < 4; row++){
//            for(int col = 1; col <= 13; col++){
//                table[row][col] = false;
//            }
//        }
//
//
//        try {
//            int N = Integer.parseInt(br.readLine());
//
//            for(int loop = 0; loop < N; loop++){
//
//                String input_str[] = br.readLine().split("\\s+");
//                table[get_row(input_str[0])][Integer.parseInt(input_str[1])] = true;
//            }
//
//            for(int row = 0; row < 4; row++){
//                for(int col = 1; col <= 13; col++){
//                    if(table[row][col])continue;
//
//                    System.out.printf("%s %d\n", mark[row],col);
//                }
//            }
//
//
//        } catch (NumberFormatException | IOException e) {
//            // TODO 自動生成された catch ブロック
//            e.printStackTrace();
//        }
//    }
//
//    private static int get_row(String str){
//
//        switch(str){
//            case "S":
//                return 0;
//            case "H":
//                return 1;
//            case "C":
//                return 2;
//            case "D":
//                return 3;
//        }
//        return -1; //must not reach here
//    }
//}

// 参考コード2
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args){
//        Scanner scan=new Scanner(System.in);
//        String suit="SHCD";
//        boolean[][] exist=new boolean[4][14];
//        int n=scan.nextInt();
//        for(int i=0;i<n;i++){
//            String s=scan.next();
//            int num=scan.nextInt();
//            exist[suit.indexOf(s)][num]=true;
//        }
//        for(int i=0;i<4;i++){
//            for(int j=1;j<=13;j++){
//                if(!exist[i][j]){
//                    System.out.println(suit.charAt(i)+" "+j);
//                }
//            }
//        }
//        scan.close();
//    }
//}