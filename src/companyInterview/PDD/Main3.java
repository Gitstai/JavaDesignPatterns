package companyInterview.PDD;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;
        for (int i = 0,j = 0; j < n; j++) {
            if(map.containsKey(arr[j])){
                i = Math.max(map.get(arr[j]),i);
            }
            max = Math.max(max,j - i + 1);
            map.put(arr[j],j + 1);
        }
        System.out.println(max);
    }

}
