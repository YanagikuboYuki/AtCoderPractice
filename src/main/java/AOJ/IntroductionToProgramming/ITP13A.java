package AOJ.IntroductionToProgramming;

public class ITP13A {
    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            System.out.println("Hello World");
        }
    }
}

// 参考コード
// StringBuilder使ったほうが全然早い
// 34ms -> 1ms になった
//public class Main {
//
//    public static final int BIG_NUM  = 2000000000;
//    public static final int MOD  = 1000000007;
//
//    public static void main(String[] args) {
//
//        StringBuilder ans = new StringBuilder();
//
//        for(int i = 0; i < 1000; i++){
//            ans.append("Hello World\n");
//        }
//        System.out.print(ans.toString());
//    }
//}