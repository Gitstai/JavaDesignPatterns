package Algorithm;

import java.util.List;

public class FindLongestWord524 {
    public static void main(String[] args) {

    }

    public String findLongestWord(String s, List<String> d) {
        String res = "";
        for (String str : d) {
            for (int i = 0, j = 0; i < s.length() && j < str.length(); i++) {
                if (s.charAt(i) == str.charAt(j)) j++;
                if (j == str.length()){
                    if (res.length() < str.length() || (res.length() == str.length() && res.compareTo(str) > 0)) res = str;
                }
            }
        }
        return res;
    }
}
