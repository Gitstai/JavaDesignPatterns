package Algorithm.sort;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {
    public static void main(String[] args) {
        int[] ins = {9,8,7,6,5,4,3,2,1};
        int[] ins2 = sort(ins);
        for(int in: ins2){
            System.out.print(in + " ");
        }
    }
    public static int[] sort(int[] ins){
        if(ins.length <=1){
            return ins;
        }
        int num = ins.length/2;
        int[] left = sort(Arrays.copyOfRange(ins, 0, num));
        int[] right = sort(Arrays.copyOfRange(ins, num, ins.length));
        return merge(left,right);
    }
    public static int[] merge(int[] left, int[] right){
        int l=0;
        int r=0;
        List<Integer> list = new ArrayList<Integer>();
        while(l<left.length && r<right.length){
            if(left[l] < right[r]){
                list.add(left[l]);
                l += 1;
            }else{
                list.add(right[r]);
                r += 1;
            }
        }
        if(l>=left.length){
            for(int i=r; i<right.length; i++){
                list.add(right[i]);
            }
        }
        if(r>=right.length){
            for(int i=l; i<left.length; i++){
                list.add(left[i]);
            }
        }
        int[] result = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            result[i] = list.get(i);
        }
        return result;
    }
}