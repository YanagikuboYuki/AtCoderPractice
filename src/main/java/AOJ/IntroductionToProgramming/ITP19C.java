package AOJ.IntroductionToProgramming;

import java.util.Scanner;

public class ITP19C {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            int taro = 0;
            int hanako = 0;
            for (int i = 0; i < n; i++) {

                int judge = sc.next().compareTo(sc.next());
                if (judge > 0) {
                    taro += 3;
                } else if (judge < 0) {
                    hanako += 3;
                } else {
                    taro += 1;
                    hanako += 1;
                }
            }
            System.out.println(taro + " " + hanako);
        }
    }
}
