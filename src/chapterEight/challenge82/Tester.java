package chapterEight.challenge82;

public class Tester {
    public static void main(String[] args) {
        ArrayOperations arrayOperations = new ArrayOperations(new int[]{1, 3, 5, 9});
        ArrayOperations.Statistics statistics = arrayOperations.new Statistics();
        System.out.println(   statistics.mean());
    }
}
