package AOJ.IntroductionToProgramming;

import java.util.Scanner;

public class ITP18A {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String s = sc.nextLine();
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < s.toCharArray().length; i++) {
                if (Character.isLowerCase(s.charAt(i))) {
                    sb.append(String.valueOf(s.charAt(i)).toUpperCase());
                } else {
                    sb.append(String.valueOf(s.charAt(i)).toLowerCase());
                }
            }

            System.out.println(sb.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

// 参考コード
// アスキーコード表で計算している
// https://java-reference.com/java_info_ascii.html
//import java.util.*;
//class Main {
//    public static void main (String[] args) throws java.lang.Exception {
//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//        for(int i = 0; i < s.length(); i++) {
//            char c = s.charAt(i);
//            if('a' <= c && c <= 'z') System.out.print((char)(c - 32));
//            else if('A' <= c && c <= 'Z') System.out.print((char)(c + 32));
//            else System.out.print(c);
//        }
//        System.out.println();
//    }
//}

