package InternshipInterview.ThreadLearning;

import java.util.concurrent.*;


/**
 * 五种产生线程池的方法
 */
public class Pool {
    public static void main(String[] args) {
//        ExecutorService threadPool = Executors.newCachedThreadPool();
//        ExecutorService threadPool1 = Executors.newSingleThreadExecutor();
//        ExecutorService threadPool3 = Executors.newFixedThreadPool();
//        ExecutorService threadPool4 = Executors.newScheduledThreadPool();
        ExecutorService threadPool2 = new ThreadPoolExecutor(
                2,
                5,
                3,
                TimeUnit.SECONDS,
                new LinkedBlockingDeque<>(3),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy()
        );
        try {
            for (int i = 0; i < 9; i++) {
                threadPool2.execute(()->{
                    System.out.println(Thread.currentThread().getName()+" ok!");
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            threadPool2.shutdown();
        }

    }
}
