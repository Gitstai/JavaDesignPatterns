package Algorithm.sort;

public class BubbleSort {
    public static void main(String[] args) {
        sort(new int[]{1,2,3,4,5,6,7,9,8,7});
    }

    public static void sort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length-i; j++) {
                if (arr[j-1] > arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
