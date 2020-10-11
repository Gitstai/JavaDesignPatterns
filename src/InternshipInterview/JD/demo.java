package InternshipInterview.JD;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        out("",n,m,list);
    }
    public static void out(String result, int n, int m, List<Integer> list){
        for (int i = m; i <= n; i++) {
            List<Integer> temp = new ArrayList<>(list);
            temp.add(i);
        }
    }
}

