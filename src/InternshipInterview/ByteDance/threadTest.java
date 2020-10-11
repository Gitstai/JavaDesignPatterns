package InternshipInterview.ByteDance;

public class threadTest {
    static volatile boolean isValid = false;
    public static void main(String[] args) throws InterruptedException {
        new Thread(()->{
            int i = 1;
            while (i < 100){
                if (!isValid){
                    System.out.println("A: " + i);
                    i += 2;
                    isValid = true;
                }
            }
        },"A").start();
        new Thread(()->{
            int i = 2;
            while (i <= 100){
                if (isValid){
                    System.out.println("B: " + i);
                    i += 2;
                    isValid = false;
                }
            }
        },"B").start();
        Thread.sleep(5000);
    }
}
