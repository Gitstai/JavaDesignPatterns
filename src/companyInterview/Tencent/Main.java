package companyInterview.Tencent;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Q = sc.nextInt();
        for (int i = 0; i < Q; i++) {
            long x = sc.nextLong();
            int k = sc.nextInt();
            long low = (long) Math.pow(2,k-1);
            long high = (long) (Math.pow(2,k)-1);
            if (low > x || x <= high){
                System.out.println(-1);
                continue;
            }
            while(x > 0){
                x /= 2;
                if (low <= x && x <= high){
                    System.out.println(x);
                    break;
                }
            }
        }
    }
}
