package companyInterview.PDD;

import java.util.Scanner;

public class Main2_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] start = new int[n];
        int[] end = new int[n+1];

        for (int i = 0; i < n; i++) {
            start[i] = sc.nextInt();
        }
        for (int i = 1; i <= n; i++) {
            int x = sc.nextInt();
            end[x] = i;   // 记录每一名选手的名次, 比如 end[2] = 1, 2号选手是第1名
        }

        int count = 0;    // 统计受表彰的选手的数量
        // 从出发序列遍历每一名选手, 判断是否为受表彰的选手
        for (int i = 1; i < n; i++) {   // 跳过第1位出发的选手, 因为他没有可超越的对手
            int c = start[i];
            for (int j = 0; j < i; j++) {   // 遍历先于 选手c 出发的选手
                int b = start[j];
                // 比较两人的名次: 选手c是否超越了选手b
                if (end[c] < end[b]) {
                    count++;
                    break;
                }
            }
        }

        System.out.println(count);
    }
}