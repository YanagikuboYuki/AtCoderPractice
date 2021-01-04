package AOJ.IntroductionToProgramming;

import java.util.Scanner;

public class ITP18C {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            StringBuilder sb = new StringBuilder();
            while (sc.hasNextLine()) {
                sb.append(sc.nextLine());
            }
            String s = sb.toString().toLowerCase();
            int[] nums = new int['z' - 'a' + 1];
            for (int i = 0; i < s.length(); i++) {
                if ('a' <= s.charAt(i) && s.charAt(i) <= 'z') {
                    nums[s.charAt(i) - 'a']++;
                }
            }

            for (int i = 0; i < nums.length; i++) {
                System.out.println((char) (i + 'a') + " : " + nums[i]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

// 参考コード
//import java.util.Scanner;
//
//public class ITP18C {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int[] alf = new int[26];
//        while (scan.hasNext()) {
//            String str = scan.next().toLowerCase();
//            for (int i = 0; i < str.length(); i++) {
//                char c = str.charAt(i);
//                if ('a' <= c && c <= 'z') {
//                    alf[str.charAt(i) - 'a']++;
//                }
//            }
//        }
//        for (int i = 0; i < 26; i++) {
//            System.out.println((char) ('a' + i) + " : " + alf[i]);
//        }
//        scan.close();
//    }
//}