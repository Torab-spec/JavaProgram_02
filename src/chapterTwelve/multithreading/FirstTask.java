package chapterTwelve.multithreading;

public class FirstTask extends Thread {

    @Override
    public void run() {
        //First task
        for (int i = 0; i <= 100; i++) {
            System.out.printf("%d* ", i);
        }
        System.out.println("\n * task complete");
    }
}
