package chapterNine.lecture02;

public abstract class Vehicle implements Transport {
    private int numberOfTires;

    public abstract void startMakeSound(); // abstract method

    public Vehicle(int numberOfTires) {
        this.numberOfTires = numberOfTires;
    }

    public int getNumberOfTires() {
        return numberOfTires;
    }

    public void setNumberOfTires(int numberOfTires) {
        this.numberOfTires = numberOfTires;
    }

    public void commute() {
        System.out.println("Going...");
    }
}
