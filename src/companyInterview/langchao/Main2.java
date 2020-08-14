package companyInterview.langchao;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        boolean[] tree = new boolean[101];
        for (int i = 1; i <= 100; i++) {
            tree[i] = true;
        }
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            tree[x] = false;
        }
        console(tree);

    }
    public static void console(boolean[] tree){
        int max1 = 0;
        int start1 = 1;
        int end1 = 1;
        int resultStart1 = 0;

        int max2 = 0;
        int start2 = 1;
        int end2 = 1;
        int resultStart2 = 0;
        for (int i = 1; i <= 99; i+=2) {
            if (tree[i]){
                end1 = i;
            }else {
                start1 = i+2;
            }
            if ( ((end1-start1)/2+1) > max1){
                resultStart1 = start1;
                max1 = (end1-start1)/2+1;
            }
        }
        for (int i = 2; i <= 100; i+=2) {
            if (tree[i]){
                end2 = i;
            }else {
                start2 = i+2;
            }
            if ( ((end2-start2)/2+1) > max2){
                resultStart2 = start2;
                max2 = (end2-start2)/2+1;
            }
        }

        if (max1 > max2){
            System.out.println(resultStart1 + " " + max1);
        }else {
            System.out.println(resultStart2 + " " + max2);
        }

    }
}
