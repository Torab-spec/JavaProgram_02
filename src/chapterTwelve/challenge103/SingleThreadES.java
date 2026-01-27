package chapterTwelve.challenge103;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadES {
    public static void main(String[] args) {
        try (ExecutorService executorService = Executors.newSingleThreadExecutor()) {
            PrintNumber printNumber = new PrintNumber();
            executorService.submit(printNumber);
        }
        // If we use try block for create a ExecutorService object then we don't need to worry about shutdown() method
        // for better practice must use the try block for create ES object


    }


}
