package companyInterview.Tencent;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] arr = new int[N];
        List<List<Integer>> lists = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int len = sc.nextInt();
            arr[i] = len-1;
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < len; j++) {
                list.add(sc.nextInt());
            }
            lists.add(list);
        }
        while (K > 0){
            int max = Integer.MIN_VALUE;
            int maxIndex = -1;
            for (int i = 0; i < N; i++) {
                if (arr[i] >= 0 && max < lists.get(i).get(arr[i])){
                    max = lists.get(i).get(arr[i]);
                    maxIndex = i;
                }
            }
            System.out.print(max + " ");
            arr[maxIndex]--;
            K--;
        }
    }
}
