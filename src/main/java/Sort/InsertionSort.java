package Sort;

import java.util.Scanner;

/**
 * 挿入ソート
 */
public class InsertionSort {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            // ソート前出力
            System.out.println("ソート前");
            for (int i = 0; i < n; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println("\n");

            // ソート処理
            for (int i = 1; i < n; i++) {
                int v = a[i];

                int j = i;
                for (; j > 0; j--) {
                    if (a[j - 1] > v) {
                        a[j] = a[j - 1];
                    } else {
                        break;
                    }
                }
                a[j] = v;

                // 各ステップを出力
                System.out.print("Step" + i + "：");
                for (int k = 0; k < n; k++) {
                    System.out.print(a[k] + " ");
                }
                System.out.println();
            }
        }
    }
}
