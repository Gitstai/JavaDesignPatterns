package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.addFirst(1);
        Integer[] arr = {1, 2, 3};
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(arr));
        for (Integer integer : list1) {
            System.out.println(integer);
        }
    }
}
