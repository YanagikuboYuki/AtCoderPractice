package ABS;

import java.util.Scanner;

public class ABC081B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }

        int count = 0;
        while (true) {
            for (int i = 0; i < N; i++) {
                if (a[i] % 2 == 1) {
                    System.out.println(count);
                    return;
                }
                a[i] = a[i] / 2;
            }
            count++;
        }
    }
}
