package RecruitInterview.douyu;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        String res = reverse("douyushabi");
        System.out.println(res);

    }

    public static String reverse (String str) {
        String res = "";
        if (str == null || str.equals("")){
            return res;
        }

        StringBuffer sb  = new StringBuffer();

        for (int i=str.length()-1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
}
