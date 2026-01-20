package chapterTwelve;

import chapterTwelve.runnableInterface.PrintTask;

public class JointMethod {
    public static void main(String[] args) throws InterruptedException {
        long startTime = System.currentTimeMillis();
        PrintTask p1 = new PrintTask('*');
        PrintTask p2 = new PrintTask('$');
        PrintTask p3 = new PrintTask('#');

        Thread t1 = new Thread(p1); // wrapping the p1 object with t1 object
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        System.out.println(" thread1 completed ");
        Thread t2 = new Thread(p2);
        t2.setPriority(Thread.NORM_PRIORITY);
        t2.start();
        System.out.println(" thread2 completed ");
        t1.join(); // stop the main thread and  complete the t1 thread execution then after the completing t1 execution then after start the main thread again
        Thread t3 = new Thread(p3);
        t3.setPriority(Thread.MAX_PRIORITY);
        t3.start();
        System.out.println(" thread3 completed ");
        long endTime = System.currentTimeMillis();
        System.out.printf("%s Total time taken: %d",
                Thread.currentThread().getName(),
                (endTime - startTime));
    }
}
