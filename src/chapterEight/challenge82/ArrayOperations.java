package chapterEight.challenge82;

public class ArrayOperations {

    private int[] array;

    public ArrayOperations(int[] array) {
        this.array = array;
    }

    public class Statistics {

        double mean() {
            double sum = 0;
            for (int i : array) {
                sum += i;
            }
            return sum / array.length;
        }

        double median() {

            return 0;
        }

    }
}
