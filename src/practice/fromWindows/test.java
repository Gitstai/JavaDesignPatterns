package practice.fromWindows;

public class test {
    public volatile int inc = 0;


    public void increase(){
        synchronized (com.company.test.test.class){
            inc++;
        }
    }

    public static void main(String[] args) {
        final com.company.test.test test = new com.company.test.test();
        for (int i = 0; i < 10; i++) {
            new Thread(){
                @Override
                public void run() {
                    for (int j = 0; j < 1000; j++) {
                        test.increase();
                    }
                };
            }.start();
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(test.inc);
    }
}
