package chapterTwelve.threadClass;

public class ExtendingThreadClass {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        FirstTask t1 = new FirstTask();
        SecondTask t2 = new SecondTask();
        ThirdTask t3 = new ThirdTask();

        System.out.println("\n Starting First Thread");
        t1.start();
        System.out.println("\n Starting Second Thread");
        t2.start();
        System.out.println("\n Starting Third Thread");
        t3.start();
        System.out.println("\n All Threads executed ");

        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.printf("\n Thread - %s , Total time take is : %d \n" , Thread.currentThread().getName(), totalTime);

    }
}
// Thread is class , we can extend the Thread class .
// Thread class ar joto gulo object creat kora hobe toto gulo thread create hobe
