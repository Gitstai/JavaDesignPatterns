package companyInterview.ThreadLearning;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyTest {
    public static void main(String[] args) throws InterruptedException {
//        SZY szy = new SZY();
//
//        new Thread(()->{
//            try {
//                szy.set();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        },"B").start();
//
//        new Thread(()->{
//            szy.get();
//        },"A").start();
//
//        Thread.sleep(5000);
        Integer integer = Integer.valueOf(1);
        Integer integer1 = Integer.valueOf(1);
        System.out.println(integer == integer1);
        Lock lock = new ReentrantLock();
    }


}

class SZY{

    public synchronized void set() throws InterruptedException {
        System.out.println("线程 "+ Thread.currentThread().getName()+" 使用了set：");
        Thread.sleep(3000);
        System.out.println("jieshu");
    }
    public void get(){
        System.out.println("线程 "+ Thread.currentThread().getName()+" 使用了get");
    }
}