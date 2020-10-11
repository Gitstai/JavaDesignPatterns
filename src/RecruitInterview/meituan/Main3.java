package RecruitInterview.meituan;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int[] nums = new int[N];
            for (int j = 0; j < N; j++) {
                nums[j] = sc.nextInt();
            }
            int score = Resolve(nums);
            score = Math.max(score, 0);
            System.out.println(score);
        }
    }

    public static int Resolve(int[] nums){
        if (nums.length == 0){
            return 0;
        }
        int sum = 0;
        int[] nums1 = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            nums1[i] = -nums[i];
        }
        int maxWithoutHead = GetMaxSubSum(nums);
        int maxWithHead = GetMaxSubSum(nums1);

        if (maxWithHead == -sum){
            return maxWithoutHead;
        }else {
            return Math.max(maxWithoutHead, sum+maxWithHead);
        }
    }

    public static int GetMaxSubSum(int[] nums){
        int res = nums[0];
        int tmpRes = nums[0];
        for (int i = 1; i < nums.length; i++) {
            tmpRes = Math.max(tmpRes+nums[i], nums[i]);
            if (tmpRes > res){
                res = tmpRes;
            }
        }
        return res;
    }
}
