package chapterNine.lecture02;

public class Car extends Vehicle {

    private int numberOfDoors;

    @Override
    public void startMakeSound() {
        System.out.println("Vrooom..."); // implement of abstract method
    }

    public void getSetGo() {
        System.out.println("go...");
    }

    public Car(int numberOfTires) {
        super(4);
    }
}
