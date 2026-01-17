package chapterTwelve.threadClass;

public class SecondTask extends Thread {
    @Override
    public void run() {
        //Second task
        for (int i = 0; i <= 20; i++) {
            System.out.printf("%d$ ", i);
        }
        System.out.printf("\n Thread - %s $ task complete" , Thread.currentThread().getName());

    }
}
