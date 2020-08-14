package companyInterview.xiecheng;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main2 extends DAD{

    public static void main(String[] args) throws InterruptedException {
        System.out.println("EMPTY");
        ArrayList<Integer> list = new ArrayList<>(0);
        list.add(1);
        list.size();
        int oldCapacity = 5;
        int newCapacity = oldCapacity + (oldCapacity >> 1);
        System.out.println(newCapacity);
        CopyOnWriteArrayList<Integer> list1 = new CopyOnWriteArrayList<>();
        list1.add(1);
        list1.get(0);
        Vector<Integer> vector = new Vector<>();
        vector.add(1);
        List<Integer> a = Collections.synchronizedList(new ArrayList<>());
        Thread.sleep(200);
    }
}

class DAD{
    public void pan(){

    }
}