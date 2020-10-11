package RecruitInterview.meituan;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int m;
        int a;
        int b;
        while (sc.hasNextInt()) {
            n = sc.nextInt();
            m = sc.nextInt();
            a = sc.nextInt();
            b = sc.nextInt();
            int[] nums = new int[m];
            for (int i = 0; i < m; i++) {
                nums[i] = sc.nextInt();
            }
            Resolve(n, m, a, b, nums);
        }
    }


    public static void Resolve(int n, int m, int a, int b, int[] nums) {
        if (n - m < 2){
            System.out.println("NO");
            return;
        }
        if (m == 0){
            System.out.println("YES");
            return;
        }
        int MAX = -1;
        int MIN = 1001;
        for (int num : nums) {
            if (num > MAX) {
                MAX = num;
            }
            if (num < MIN) {
                MIN = num;
            }
        }
        if (MAX <= Integer.max(a, b) && MIN >= Integer.min(a, b)){
            System.out.println("YES");
            return;
        }
        System.out.println("NO");
    }
}
