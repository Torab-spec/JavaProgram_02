package chapterNine.superKeyword;

public abstract class Vehicle {
    public String color = "Red";
    private int numOfTires;

    Vehicle() {
        this.numOfTires = 0;
        System.out.println("This is Vehicle class default constructor");
    }

    Vehicle(int numOfTires) {
        this.numOfTires = numOfTires;
        System.out.println("This is Vehicle class Parameterized constructor");
    }

    public int getNumOfTires() {
        System.out.print("Vehicle NumOfTires is : ");
        return this.numOfTires;
    }

    public abstract void start();
}
