package AOJ.IntroductionToProgramming;

import java.util.Scanner;

public class ITP19B {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            while (true) {
                String s = sc.next();
                if (s.equals("-")) {
                    break;
                }
                int m = sc.nextInt();
                int sum = 0;
                for (int i = 0; i < m; i++) {
                    sum += sc.nextInt();
                }
                int index = sum % s.length();
                System.out.println(s.substring(index) + (index == 0 ? "" : s.substring(0, index)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
