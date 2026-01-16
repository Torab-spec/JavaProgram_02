package chapterTwelve.multithreading;

public class ExtendingThreadClass {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();



        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.printf("Total time take is : %d ", totalTime);

    }
}
