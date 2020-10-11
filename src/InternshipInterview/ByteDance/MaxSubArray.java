package InternshipInterview.ByteDance;

public class MaxSubArray {
    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{1}));
    }
    public static int maxSubArray(int[] nums) {

        int sum = 0;
        int ans = 0;
        for (int num : nums) {
            if (sum > 0){
                sum += num;
            }else {
                sum = num;
            }
            ans = Math.max(sum,ans);
        }
        return ans;
    }
}
