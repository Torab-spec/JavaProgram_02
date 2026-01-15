package chapterTwelve.multithreading;

public class NeedOfMultithreading {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        //First task
        for (int i = 0; i <= 100; i++) {
            System.out.printf("%d* ", i);
        }
        System.out.println("\n * task complete");

        //Second task
        for (int i = 0; i <= 100; i++) {
            System.out.printf("%d$ ", i);
        }
        System.out.println("\n $ task complete");

        //Third task
        for (int i = 0; i <= 100; i++) {
            System.out.printf("%d# ", i);
        }
        System.out.println("\n # task complete");
        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.printf("Total time take is : %d ", totalTime);

    }
}
