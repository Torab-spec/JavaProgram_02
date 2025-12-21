package chapterEight.inheritance;

public class TwoWheeler extends Vehicle {
    public void balance() {
        System.out.println("I am balancing on Two tires");
    }

    public TwoWheeler() {
        numberOfTiers = 2;
    }
}
