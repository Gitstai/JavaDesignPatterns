package RecruitInterview.baidu;

import java.util.Scanner;

public class demo2 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            console();
        }
    }

    public static void console() {
        int CowsNum      = sc.nextInt();
        int GoodCowsNum  = 0;
        boolean[] fitCow = new boolean[CowsNum];
        int SpecialNum = sc.nextInt();
        int QuJianShu = sc.nextInt();
        int[][] arr = new int[QuJianShu][2];
        for (int j = 0; j < QuJianShu; j++) {
            arr[j][0] = sc.nextInt();
            arr[j][1] = sc.nextInt();
        }
        for (int j = 0; j < QuJianShu; j++) {
            for (int k = arr[j][0]; k <= arr[j][1]; k++) {
                fitCow[k-1] = true;
            }
        }
        for (int i = 1; i < SpecialNum; i++) {
            int QuJianShu1 = sc.nextInt();
            int[][] arr1 = new int[QuJianShu1][2];
            for (int j = 0; j < QuJianShu1; j++) {
                arr1[j][0] = sc.nextInt();
                arr1[j][1] = sc.nextInt();
            }
            for (int j = 0; j < QuJianShu1; j++) {
                for (int k = 1; k < arr1[j][0]; k++) {
                    fitCow[k-1] = false;
                }
                for (int k = arr1[j][1]; k < CowsNum; k++) {
                    fitCow[k-1] = false;
                }
            }
        }
        for (int i = 0; i < CowsNum; i++) {
            if (fitCow[i]) {
                GoodCowsNum++;
            }
        }
        System.out.println(GoodCowsNum);
        for (int i = 0; i < CowsNum; i++) {
            if (fitCow[i]) {
                System.out.println(i+1 + " ");
            }
        }
    }
}
