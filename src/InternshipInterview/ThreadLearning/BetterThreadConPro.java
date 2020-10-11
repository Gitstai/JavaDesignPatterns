package InternshipInterview.ThreadLearning;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BetterThreadConPro {
    public static void main(String[] args) {
        Data data = new Data();
        new Thread(()->{
            for (int i = 0; i < 5; i++) {
                try {
                    data.increase();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"A").start();
        new Thread(()->{
            for (int i = 0; i < 5; i++) {
                try {
                    data.decrease();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"B").start();

    }
}

//synchronize实现
class Data{
    private int number = 0;

    public synchronized void increase() throws InterruptedException {
        while (number != 0){
            this.wait();
        }
        number++;
        System.out.println(Thread.currentThread().getName()+"   "+ number);
        this.notifyAll();
    }
    public synchronized void decrease() throws InterruptedException {
        while (number == 0){
            this.wait();
        }
        number--;
        System.out.println(Thread.currentThread().getName()+ "  " + number);
        this.notifyAll();
    }
}

//LOCK实现
class Data2{
    private int number = 0;
    Lock lock = new ReentrantLock();
    Condition condition = lock.newCondition();

    public synchronized void increase() throws InterruptedException {
        try {
            lock.lock();
            while (number != 0){
                condition.await();
            }
            number++;
            System.out.println(Thread.currentThread().getName()+"   "+ number);
            condition.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }

    }
    public synchronized void decrease() throws InterruptedException {
        try {
            lock.lock();
            while (number == 0){
                condition.await();
            }
            number--;
            System.out.println(Thread.currentThread().getName()+ "  " + number);
            condition.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
}