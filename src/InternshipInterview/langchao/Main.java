package InternshipInterview.langchao;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] r = new int[n];
        for (int i = 0; i < n; i++) {
            r[i] = sc.nextInt();
        }
        int count1 = 0;
        int count2 = 0;
        int[] sorted = Arrays.copyOfRange(r,0,r.length);
        Arrays.sort(sorted);
        for (int i = 0,j = 0; i < n; i++) {
            if (sorted[j] == r[i]){
                count1++;
                j++;
            }
        }
        for (int i = n-1,j = n-1; i >= 0; i--) {
            if (sorted[j] == r[i]){
                count2++;
                j--;
            }
        }
        if (count1 > count2){
            System.out.println(n-count1);
        }else {
            System.out.println(n-count2);
        }
    }

}
