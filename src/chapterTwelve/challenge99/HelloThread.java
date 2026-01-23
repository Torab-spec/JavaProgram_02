package chapterTwelve.challenge99;

public class HelloThread extends Thread {
    private final int threadNumber;

    public HelloThread(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("(%d). Hello Thread-%d\n", i, threadNumber);
        }
    }
}

