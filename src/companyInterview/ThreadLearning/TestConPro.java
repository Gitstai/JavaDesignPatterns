package companyInterview.ThreadLearning;

/**
 * 生产着消费者问题
 * 管程法
 * ZST
 */

public class TestConPro {
    public static void main(String[] args) {
        Container container = new Container();
        Producer producer = new Producer(container);
        Consumer consumer = new Consumer(container);
        producer.start();
//        consumer.start();
    }
}

class Consumer extends Thread {
    Container con;
    Consumer(Container con){
        this.con = con;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                System.out.println("消费了 : " + con.pop().id);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Producer extends Thread {
    Container con;
    Producer(Container con){
        this.con = con;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                con.push(new Chicken(i+1));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("生产了 : " + (i+1));
        }
    }
}

class Container{
    Chicken[] chickens = new Chicken[10];
    int count=0;

    public synchronized void push (Chicken chicken) throws InterruptedException {
        if (count == 10){
            this.wait();
        }
        chickens[count++] = chicken;
        this.notifyAll();
    }
    public synchronized Chicken pop () throws InterruptedException {
        if (count == 0){
            this.wait();
        }
        Chicken res = chickens[--count];
        this.notifyAll();
        return res;
    }

}

class Chicken{
    int id;
    Chicken(int id){
        this.id = id;
    }
}