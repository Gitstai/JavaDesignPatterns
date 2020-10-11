package InternshipInterview.ThreadLearning;

import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizedWrongUse {
    public static void main(String[] args) throws Exception {
        //初始化
        SomeoneObject obj = new SomeoneObject();
        Worker a = new Worker("A", obj);
        Worker b = new Worker("B", obj);
        //启动线程
        a.start();
        b.start();
        //等待线程启动
        Thread.sleep(1000);
        //唤醒obj
        synchronized(obj){
            obj.notifyAll();
            System.out.println("notifyAll done.");
        }
        //等待线程结束
        a.join();
        b.join();
        //输出结果
        System.out.println("Amount:"+obj.getAmount());//只有50
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();
        list.add(1);
        System.out.print(list.get(0));
    }

    static class Worker extends Thread {
        private SomeoneObject obj;
        public Worker(String name, SomeoneObject obj){
            super(name);
            this.obj = obj;
        }
        public void run(){
            System.out.println("Worker["+this.getName()+"]started.");
            synchronized(obj){//为保证obj操作的互斥性，加同步锁,但是wait释放了同步锁
              try{
                  obj.wait();//这里wait释放了同步锁
              }catch(InterruptedException e){
                  return;
              }
                int amount = obj.getAmount();
                amount += 50;
                obj.setAmount(amount);
                System.out.println("Worker["+this.getName()+"]setting done.");
            }
        }
    }
    /**
     * @author lix
     *某对象
     */
    static class SomeoneObject{
        int amount;//属性
        public int getAmount(){
            return amount;
        }
        public void setAmount(int amount){
            this.amount = amount;
        }
    }
}