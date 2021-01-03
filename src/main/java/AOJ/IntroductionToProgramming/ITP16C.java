package AOJ.IntroductionToProgramming;

import java.util.Collections;
import java.util.Scanner;

public class ITP16C {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            int n = sc.nextInt();
            int[][][] info = new int[4][3][10];

            for (int i = 0; i < n; i++) {
                int b = sc.nextInt();
                int f = sc.nextInt();
                int r = sc.nextInt();
                int v = sc.nextInt();

                info[b - 1][f - 1][r - 1] += v;
            }
            for (int i = 0; i < info.length; i++) {
                for (int j = 0; j < info[0].length; j++) {
                    for (int k = 0; k < info[0][0].length; k++) {
                        System.out.print(" " + info[i][j][k]);
                    }
                    System.out.println();
                }
                if (i != info.length - 1) {
                    System.out.println(String.join("", Collections.nCopies(20, "#")));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
