package AOJ.IntroductionToProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ITP18B {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            while (true) {
                String[] numStrs = br.readLine().split("");
                if (numStrs.length == 1 && numStrs[0].equals("0")) {
                    break;
                }

                int sum = 0;
                for (String numStr : numStrs) {
                    sum += Integer.valueOf(numStr);
                }
                System.out.println(sum);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

// 参考コード
// アスキー表の数字で計算している。
// https://java-reference.com/java_info_ascii.html
//import java.util.*;
//class Main {
//    public static void main (String[] args) throws java.lang.Exception {
//        Scanner sc = new Scanner(System.in);
//        while(true) {
//            String s = sc.next();
//            if(s.equals("0")) break;
//            int ret = 0;
//            for(int i = 0; i < s.length(); i++) ret += s.charAt(i) - 48;
//            System.out.println(ret);
//        }
//    }
//}