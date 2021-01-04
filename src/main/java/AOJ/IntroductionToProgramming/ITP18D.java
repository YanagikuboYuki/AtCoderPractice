package AOJ.IntroductionToProgramming;

import java.util.Scanner;

public class ITP18D {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String s = sc.nextLine();
            String p = sc.nextLine();

            if ((s + s).contains(p)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
