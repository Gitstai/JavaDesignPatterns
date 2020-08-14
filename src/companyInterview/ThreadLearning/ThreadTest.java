package companyInterview.ThreadLearning;

public class ThreadTest extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread threadTest = new ThreadTest();
        Thread th = new Thread(threadTest, "线程");
        th.start();

        for (int i = 0; i < 20; i++) {
            if (i == 10){
                th.join();
            }
            System.out.println(Thread.currentThread().getName() + " : " +i);
        }
    }
}
