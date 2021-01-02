package AOJ.IntroductionToProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class ITP12C {
    public static void main(String[] args) {
        int[] nums = new int[3];
        Scanner sc = new Scanner(System.in);
        nums[0] = sc.nextInt();
        nums[1] = sc.nextInt();
        nums[2] = sc.nextInt();

        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i != 0) {
                System.out.print(" ");
            }
            System.out.print(nums[i]);
        }
        System.out.println();
    }
}

// 参考コード

//import java.util.Scanner;
//
//public class ITP12C {
//
//    public static void main(String[] args) {
//        int[] table = new int[3];
//
//        Scanner sc = new Scanner(System.in);
//
//        table[0] = sc.nextInt();
//        table[1] = sc.nextInt();
//        table[2] = sc.nextInt();
//
//        Integer work;
//
//        for (int base_loc = 0; base_loc <= 1; base_loc++) {
//            for (int comp_loc = table.length - 1; comp_loc >= base_loc + 1; comp_loc--) {
//                if (table[comp_loc] < table[comp_loc - 1]) {
//                    work = table[comp_loc - 1];
//                    table[comp_loc - 1] = table[comp_loc];
//                    table[comp_loc] = work;
//                }
//            }
//        }
//
//        for (int i = 0; i < table.length; i++) {
//            if (i != 0) {
//                System.out.printf(" ");
//            }
//            System.out.printf("%d", table[i]);
//        }
//        System.out.printf("\n");
//    }
//}
