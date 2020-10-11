package InternshipInterview.kuaishou;

public class ArrayTest {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10};
        //ZST的垃圾算法，写错了，当n%arr.length==0时出错。
//        int n = 5;
//        int start = 0;
//        int resIndex = (start + n) % arr.length;
//        int temp = arr[start];
//
//        for (int count=0;count < arr.length;resIndex = (resIndex + n) % arr.length,count++){
//            int x = arr[resIndex];
//            arr[resIndex] = temp;
//            temp = x;
//        }
//        for (int i:arr) {
//            System.out.print(i+ "  ");
//        }


        //举世无双好方法！！！！！！！三次反转！！！重要思想！！
        ArrayTest arrayTest = new ArrayTest();
        arrayTest.change(arr,100,false);
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }

    public void change(int[] nums,int k,boolean left){
        int n = nums.length;
        k %= n;
        if (k == 0) return;
        if (left){
            reverse(nums,0,k-1);
            reverse(nums,k,n-1);
        }else {
            reverse(nums,0,n-k-1);
            reverse(nums,n-k,n-1);
        }
        reverse(nums,0,n-1);
    }

    public void reverse(int[] nums,int left,int right){
        while (left < right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}
