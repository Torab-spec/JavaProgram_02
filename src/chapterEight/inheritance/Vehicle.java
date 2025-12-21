package chapterEight.inheritance;

public class Vehicle {
    public int numberOfTiers;

    protected int price;

    public void commute() {
        System.out.printf("I am going from place A to place B using %d tires \n", numberOfTiers);
    }

}
