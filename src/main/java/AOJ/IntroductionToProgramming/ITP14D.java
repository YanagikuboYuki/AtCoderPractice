package AOJ.IntroductionToProgramming;

import java.util.Scanner;

public class ITP14D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int min = nums[0];
        int max = nums[0];
        long sum = nums[0];

        for (int i = 1; i < n; i++) {
            sum += nums[i];
            if (nums[i] < min) {
                min = nums[i];
            }
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        System.out.printf("%d %d %d\n", min, max, sum);
    }
}

// 参考コード
//import java.io.BufferedReader;
//        import java.io.IOException;
//        import java.io.InputStreamReader;
//
//
//
//public class Main {
//
//    private static final int BIG_NUM  = 2000000000;
//
//    public static void main(String[] args) {
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        long sum = 0;
//        int minimum = BIG_NUM,maximum = -BIG_NUM;
//
//        try {
//
//            int N = Integer.parseInt(br.readLine());
//
//            String first[] = br.readLine().split("[\\s]+");
//            int array[] = new int[first.length];
//
//            for(int i = 0; i < first.length; i++){
//
//                array[i] = Integer.parseInt(first[i]);
//                minimum = Math.min(minimum, array[i]);
//                maximum = Math.max(maximum, array[i]);
//                sum += array[i];
//            }
//
//            System.out.printf("%d %d %d\n",minimum,maximum,sum);
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//    }
//}