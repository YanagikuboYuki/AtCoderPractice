package AOJ.IntroductionToProgramming;

import java.util.Scanner;

public class ITP17B {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n;
            int x;
            int count;
            while (true) {
                n = sc.nextInt();
                x = sc.nextInt();
                if (n == 0 && x == 0) {
                    break;
                }

                count = 0;
                for (int i = 1; i < n + 1; i++) {
                    for (int j = i + 1; j < n + 1; j++) {
                        for (int k = j + 1; k < n + 1; k++) {
                            // i != j && j != k && k != i これはかぶることがないからいらない
                            if (i != j && j != k && k != i && i + j + k == x) {
                                count++;
                            }
                        }
                    }
                }
                System.out.println(count);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

// 参考コード 1
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args){
//        Scanner scan=new Scanner(System.in);
//        while(true){
//            int n=scan.nextInt();
//            int x=scan.nextInt();
//            if(n==0&&x==0)break;
//            int ans=0;
//            for(int i=1;i<=n;i++){
//                for(int j=i+1;j<=n;j++){
//                    for(int k=j+1;k<=n;k++){
//                        if(i+j+k==x)ans++;
//                    }
//                }
//            }
//            System.out.println(ans);
//        }
//        scan.close();
//    }
//}

// 参考コード2
// 1個目と2個目も最後までやる必要ないからよい
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
//        String buffer[] = new String[2];
//        int N,X,ans;
//
//        while(true){
//
//            try {
//                buffer = br.readLine().split("\\s+");
//                N = Integer.parseInt(buffer[0]);
//                X = Integer.parseInt(buffer[1]);
//
//                if(N == 0 && X == 0)break;
//
//                ans = 0;
//
//                for(int a = 1; a <= N-2; a++){
//                    for(int b = a+1; b <= N-1; b++){
//                        for(int c = b+1; c <= N; c++){
//                            if(a+b+c == X){
//                                ans++;
//                            }
//                        }
//                    }
//                }
//
//                System.out.printf("%d\n", ans);
//
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}