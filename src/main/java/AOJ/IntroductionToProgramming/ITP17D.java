package AOJ.IntroductionToProgramming;

import java.util.Scanner;

public class ITP17D {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int l = sc.nextInt();

            int[][] A = new int[n][m];
            int[][] B = new int[m][l];
            long[][] C = new long[n][l];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    A[i][j] = sc.nextInt();
                }
            }
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < l; j++) {
                    B[i][j] = sc.nextInt();
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    for (int k = 0; k < l; k++) {
                        C[i][k] += A[i][j] * B[j][k];
                    }
                }
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < l; j++) {
                    System.out.print(C[i][j] + (j != l - 1 ? " " : "\n"));
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

// 参考コード
// 行列の計算式通りの計算になっている。自分のは、各マスを別々に足している。
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args){
//        Scanner scan=new Scanner(System.in);
//        int n=scan.nextInt();
//        int m=scan.nextInt();
//        int l=scan.nextInt();
//        int[][] a=new int[n][m];
//        int[][] b=new int[m][l];
//        long[][] c=new long[n][l];
//        for(int i=0;i<n;i++)for(int j=0;j<m;j++)a[i][j]=scan.nextInt();
//        for(int i=0;i<m;i++)for(int j=0;j<l;j++)b[i][j]=scan.nextInt();
//        for(int i=0;i<n;i++)for(int j=0;j<l;j++)for(int k=0;k<m;k++)c[i][j]+=a[i][k]*b[k][j];
//        for(int i=0;i<n;i++){
//            for(int j=0;j<l;j++){
//                if(j>0)System.out.print(" ");
//                System.out.print(c[i][j]);
//            }
//            System.out.println();
//        }
//        scan.close();
//    }
//}
