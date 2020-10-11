package InternshipInterview.ByteDance;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class test{
    private int hahahha;
    private static int y;
    public static void main(String[] args) {
        int[] a = new int[]{2, 1, 2, 2, 1, 2};
        int result = a[0];
        int count = 1;
        for (int i = 1; i < a.length; i++) {
            if (count == 0){
                result = a[i];
            }
            if (result != a[i]){
                count--;
            }else {
                count++;
            }
        }
        System.out.println(result + "  " + count);
        List<List<Integer>> list = new ArrayList<>(Arrays.asList(
                Arrays.asList(1,2),
                Arrays.asList(1,2)
        ));
        CopyOnWriteArrayList<Integer> list1 = new CopyOnWriteArrayList<>();
    }

}