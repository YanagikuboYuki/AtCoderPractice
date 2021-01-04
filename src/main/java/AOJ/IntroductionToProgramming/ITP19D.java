package AOJ.IntroductionToProgramming;

import java.util.Scanner;

public class ITP19D {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String str = sc.next();
            int q = sc.nextInt();
            sc.nextLine();

            for (int i = 0; i < q; i++) {
                String[] commands = sc.nextLine().split(" ");

                switch (commands[0]) {
                    case "print":
                        System.out.println(str.substring(Integer.valueOf(commands[1]), Integer.valueOf(commands[2]) + 1));
                        break;
                    case "reverse":
                        String reverse = new StringBuilder(str.substring(Integer.valueOf(commands[1]), Integer.valueOf(commands[2]) + 1)).reverse().toString();
                        str = new StringBuilder(str).replace(Integer.valueOf(commands[1]), Integer.valueOf(commands[2]) + 1, reverse).toString();
                        break;
                    case "replace":
                        str = new StringBuilder(str).replace(Integer.valueOf(commands[1]), Integer.valueOf(commands[2]) + 1, commands[3]).toString();
                        break;
                    default:
                        // must not reach here
                        break;
                }
            }
        }
    }
}

// 参考コード
// メソッドに分けて、配列で文字列操作
//import java.util.Scanner;
//
//public class Main {
//
//    public static final int BIG_NUM  = 2000000000;
//    public static final int MOD  = 1000000007;
//
//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//
//        String str = scanner.next();
//        String order,change;
//        int Q = scanner.nextInt();
//        int a,b;
//
//        for(int loop = 0; loop < Q; loop++){
//            order = scanner.next();
//
//            if(order.equals("print")){
//
//                a = scanner.nextInt();
//                b = scanner.nextInt();
//
//                print(str,a,b);
//
//            }else if(order.equals("reverse")){
//
//                a = scanner.nextInt();
//                b = scanner.nextInt();
//
//                str = reverse(str,a,b);
//
//            }else{
//
//                a = scanner.nextInt();
//                b = scanner.nextInt();
//                change = scanner.next();
//
//                str = replaceStr(str,a,b,change);
//            }
//        }
//    }
//
//    private static void print(String str,int a,int b){
//        String output = str.substring(a, b+1);
//        System.out.println(output);
//    }
//
//    private static String reverse(String str,int a,int b){
//
//        char work[] = str.toCharArray();
//
//        int num = b-a+1;
//        char tmp;
//
//        for(int i = 0; i < num/2; i++){
//
//            tmp = work[a+i];
//            work[a+i] = work[b-i];
//            work[b-i] = tmp;
//        }
//
//        return String.valueOf(work).substring(0, str.length());
//    }
//
//    private static String replaceStr(String str,int a,int b,String change){
//
//        char ch[] = change.toCharArray();
//        char work[] = str.toCharArray();
//
//        for(int i = a; i <= b; i++){
//            work[i] = ch[i-a];
//        }
//
//        return String.valueOf(work).substring(0,str.length());
//    }
//}