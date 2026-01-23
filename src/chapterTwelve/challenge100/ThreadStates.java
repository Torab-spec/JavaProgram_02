package chapterTwelve.challenge100;

public class ThreadStates extends Thread {
    public void run() {
        try {
            Thread.sleep(4000);
            System.out.printf("From inside run %s\n", getState());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
