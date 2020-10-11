package InternshipInterview.Tencent;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] res = new int[T];
        for (int i = 0; i < T; i++) {
            res[i] = sc.nextInt()*5;
        }
        for (int i = 0; i < T; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
