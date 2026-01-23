package chapterTwelve.challenge101;

public class JoinMethod extends Thread {
    private final int threadNumber;

    public JoinMethod(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        System.out.printf("%s Thread starting - %d \n", this.getName(), this.threadNumber);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.printf("%s Thread ended - %d \n", this.getName(), this.threadNumber);
    }


}


