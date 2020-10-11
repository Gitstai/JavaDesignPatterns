package InternshipInterview.xiecheng;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] nums = new long[n+1];
        if (n > 3){
            long res;
            res = console(n,nums);
            for (int i = 0; i <= n-3; i++) {
                if (i == 0){
                    res += console(n-3-i,nums);
                }else if (i == n-3){
                    res += console(i,nums);
                }else {
                    res += console(i,nums)*console(n-3-i,nums);
                }
            }
            System.out.println(res);
        }else if (n == 3){
            System.out.println(console(n,nums)+1);
        } else if (n > 0){
            System.out.println(console(n,nums));
        }else {
            System.out.println(-1);
        }
    }
    public static long console(int n,long[] nums){
        if (n == 1){
            return 1;
        }
        if (n == 2){
            return 2;
        }
        if (n <= 0){
            return 0;
        }
        if (nums[n] > 0){
            return nums[n];
        }
        nums[n] = console(n-1,nums)+console(n-2,nums);
        return nums[n];
    }
}
