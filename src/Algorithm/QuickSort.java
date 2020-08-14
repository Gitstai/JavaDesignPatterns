package Algorithm;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = new int[]{9,8,7,6,5,4,3,2,1};
        sort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }

    //Ð´·¨1
    public static void sort(int[] arr, int low, int high){
        if (low >= high) return;

        int left = low;
        int right = high;
        int flag = arr[low];
        while (left < right) {
            while (flag <= arr[right] && left < right) right--;
            if (left < right) {
                arr[left] = arr[right];
            }
            while (flag >= arr[left] && left < right) left++;
            if (left < right) {
                arr[right] = arr[left];
            }
            if (left == right) {
                arr[left] = flag;
            }
        }
        sort(arr, low, left - 1);
        sort(arr, left + 1, high);
    }
    private static void quickSort(int[]a,int low,int high){
        int i = low;
        int j = high;
        int x;
        if (low >= high){
            return;
        }
        int temp = a[low];
        while ( i < j ){

            while(a[j] <= temp && i < j){
                --j;
            }

            while(a[i] >= temp && i < j){
                ++i;
            }

            if (i < j){
                x = a[j];
                a[j] = a[i];
                a[i] = x;
            }
            if(i == j){
                x = a[i];
                a[i] = a[low];
                a[low] = x;
            }
        }
        quickSort(a,low,i-1);
        quickSort(a,i+1,high);
    }
}
