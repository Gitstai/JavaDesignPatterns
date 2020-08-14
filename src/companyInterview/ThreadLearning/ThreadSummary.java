package companyInterview.ThreadLearning;


import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 线程总结
 */
public class ThreadSummary {
    public static void main(String[] args) {

        //way1
        new MyThread1().start();

        //way2
        new Thread(new MyThread2()).start();

        //way3
        FutureTask<Integer> futureTask = new FutureTask<>(new MyThread3());
        new Thread(futureTask).start();
        Integer integer = null;
        try {
            integer = futureTask.get();
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        System.out.println(integer);
    }
}

class MyThread1 extends Thread {
    @Override
    public void run() {
        System.out.println("1");
    }
}

class MyThread2 implements Runnable {
    @Override
    public void run() {
        System.out.println("2");
    }
}

class MyThread3 implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        System.out.println("3");
        return 100;
    }
}