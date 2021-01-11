package Sort;

import java.util.Scanner;

/**
 * マージソート
 *
 */
public class MergeSort {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            // ソート前
            System.out.println("ソート前");
            for (int i = 0; i < n; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();

            mergeSort(a, n);

            // ソート後
            System.out.println("ソート後");
            for (int i = 0; i < n; i++) {
                System.out.print(a[i] + " ");
            }
        }
    }

    private static void mergeSort(int[] a, int n) {
        if (n < 2) {
            return;
        }
        int mid = n/2;
        int[]l = new int[mid];
        int[]r = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i]= a[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid]= a[i];
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(a, l, r, mid, n - mid);
    }

    private static void merge(
            int[] a, int[] l, int[] r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i]<= r[j]) {
                a[k++]= l[i++];
            }
            else {
                a[k++]= r[j++];
            }
        }
        while (i < left) {
            a[k++]= l[i++];
        }
        while (j < right) {
            a[k++]= r[j++];
        }
    }
}
