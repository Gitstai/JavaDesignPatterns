package RecruitInterview.meituan;

import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int x;
        int res = 0;
        n = sc.nextInt();
        x = sc.nextInt();
        int[] score = new int[n];
        for (int i = 0; i < n; i++) {
            score[i] = sc.nextInt();
        }
        Arrays.sort(score);
        int idx = n-x;
        if (score[idx] == 0){
            for (int i = idx+1; i < score.length; i++) {
                if (score[i] > 0) {
                    res++;
                }
            }
        }else {
            res = x;
            for (int i = idx-1; i >= 0; i--) {
                if (score[i] == score[idx]){
                    res++;
                }
            }
        }
        System.out.println(res);
    }
}
