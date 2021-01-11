package ABC.ABC20210110;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (Math.abs(a - b) > 2) {
                System.out.println("No");
            } else {
                System.out.println("Yes");
            }
        }
    }
}
