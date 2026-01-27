package chapterTwelve.challenge104;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MultiThreadES {
    public static void main(String[] args) {

        try (ExecutorService executorService = Executors.newFixedThreadPool(3);) {
            for (int i = 0; i < 5; i++) {
                SleepTask task = new SleepTask();
                executorService.submit(task);
            }
            executorService.shutdown();
            if (!executorService.awaitTermination(10, TimeUnit.SECONDS)) {
                System.out.println("Emergency Shutdown");
                executorService.shutdownNow();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
