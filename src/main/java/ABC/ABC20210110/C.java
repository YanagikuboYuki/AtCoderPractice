package ABC.ABC20210110;

import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int N = (int) Math.pow(2, n);
            int mid = N / 2;
            int[] left = new int[mid];
            int[] right = new int[mid];
            for (int i = 0; i < mid; i++) {
                left[i] = sc.nextInt();
            }
            for (int i = 0; i < mid; i++) {
                right[i] = sc.nextInt();
            }

            int leftMax = left[0];
            int leftIndex = 0;
            for (int i = 0; i < mid; i++) {
                if (leftMax < left[i]) {
                    leftMax = left[i];
                    leftIndex = i;
                }
            }
            int rightMax = right[0];
            int rightIndex = 0;
            for (int i = 0; i < mid; i++) {
                if (rightMax < right[i]) {
                    rightMax = right[i];
                    rightIndex = i;
                }
            }

            if (leftMax > rightMax) {
                System.out.println(mid + rightIndex + 1);
            } else {
                System.out.println(leftIndex + 1);
            }
        }
    }
}
