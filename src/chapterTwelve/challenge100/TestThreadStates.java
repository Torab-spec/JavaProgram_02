package chapterTwelve.challenge100;

public class TestThreadStates {
    public static void main(String[] args) throws InterruptedException {
        ThreadStates t1 = new ThreadStates();
        System.out.printf("From inside run %s\n", t1.getState());
        t1.start();

        t1.join();
        System.out.printf("Thread finished %s ", t1.getState());
    }
}
