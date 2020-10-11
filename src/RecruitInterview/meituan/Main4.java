package RecruitInterview.meituan;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        String str = sc.nextLine();
        String[] s = str.split(" ");
        for (String value : s) {
            System.out.println(value);
        }
        System.out.println(s[0].equals(s[10]));
        System.out.println(s[0].equals("A"));
    }
}
