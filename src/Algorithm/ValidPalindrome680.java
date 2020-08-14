package Algorithm;

public class ValidPalindrome680 {
    public static void main(String[] args) {
        System.out.println(validPalindrome("cupuufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupucu"));
    }
    public static boolean validPalindrome(String s) {
        char[] chs = s.toCharArray();
        int left = 0;
        int right = chs.length - 1;
        boolean used = false;
        while (left <= right) {
            if (chs[left] == chs[right]) {
                left++;
                right--;
            } else {
                return isValid(chs, left + 1, right) || isValid(chs, left, right - 1);
            }
        }
        return true;
    }
    public static boolean isValid(char[] chs, int left, int right) {
        while (left <= right) {
            if (chs[left] == chs[right]) {
                left++;
                right--;
            } else {
                return false;
            }
        }
        return true;
    }
}
