package AOJ.IntroductionToProgramming;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ITP19A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String W = sc.nextLine();
        List<String> TList = new ArrayList<>();
        while (sc.hasNext()) {
            String s = sc.next();
            if (s.equals("END_OF_TEXT")) {
                break;
            }

            TList.add(s.toLowerCase());
        }

        int count = 0;
        for (String s : TList) {
            if (s.equals(W)) {
                count++;
            }
        }

        System.out.println(count);

        sc.close();
    }
}

// 参考コード
// Listに入れずにそのまま中でカウントすればよかった。
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args){
//        Scanner scan=new Scanner(System.in);
//        String W=scan.next();
//        W=W.toLowerCase();
//        int ans=0;
//        while(true){
//            String T=scan.next();
//            if(T.equals("END_OF_TEXT"))break;
//            T=T.toLowerCase();
//            if(T.equals(W))ans++;
//        }
//        System.out.println(ans);
//        scan.close();
//    }
//}