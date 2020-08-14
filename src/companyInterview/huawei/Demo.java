package companyInterview.huawei;

public class Demo {
    public static void main(String[] args) {
        int[] arr = new int[]{1,8,6,2,5,4,8,3,7};
        int max = 0;
        int left = 0;
        int right = arr.length-1;
        while (left < right){
            int x = right - left;
            int y = Math.min(arr[left],arr[right]);
            if (max < (x * y)){
                max = x * y;
            }
            if (arr[left] < arr[right]){
                left++;
            }else {
                right--;
            }
        }
        System.out.println(max);
    }

}
