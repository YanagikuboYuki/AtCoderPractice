package ABS;

import java.util.Scanner;

public class ABC081A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.next().split("");

        int count = 0;
        for (String value : s) {
            if (value.equals("1")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
