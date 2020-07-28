package AOJ.IntroductionToProgramming;

import java.util.Scanner;

public class ITP11D {
    public static void main(String[] args) {
        // 数値が１桁の場合、0 を付けて２桁表示をするようにした！
//        Scanner sc = new Scanner(System.in);
//        int inputSecond = sc.nextInt();
//        int hour = inputSecond / 3600;
//        String displayHour = hour < 10 ? "0" + hour : String.valueOf(hour);
//        int minute = (inputSecond % 3600) / 60;
//        String displayMinute = minute < 10 ? "0" + minute : String.valueOf(minute);
//        int second = (inputSecond % 3600) % 60;
//        String displaySecond = second < 10 ? "0" + second : String.valueOf(second);
//        System.out.println(displayHour + ":" + displayMinute + ":" + displaySecond);
        Scanner sc = new Scanner(System.in);
        int inputSecond = sc.nextInt();
        int hour = inputSecond / 3600;
        int minute = (inputSecond % 3600) / 60;
        int second = (inputSecond % 3600) % 60;
        System.out.println(hour + ":" + minute + ":" + second);
    }
}

// 参考コード
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//public class Main {
//
//    public static void main(String[] args) {
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        try{
//
//            int S = Integer.parseInt(br.readLine());
//
//            System.out.printf("%d:%d:%d\n",S/3600,(S%3600)/60,S%60);
//
//        }catch(IOException e){
//            e.printStackTrace();
//        }
//    }
//}
