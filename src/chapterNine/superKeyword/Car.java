package chapterNine.superKeyword;

public class Car extends Vehicle {
    public String color = "Blue";
    private int numOfTires;

    public Car() {
        super(); // call the default constructor of parent class
        this.numOfTires = 2;
        System.out.println("This is Car class default constructor");
    }

    public Car(int numOfTires) {
        super(numOfTires); // call the parameterized constructor of parent class
        this.numOfTires = numOfTires;
        System.out.println("This is Car class Parameterized constructor");
    }

    @Override
    public int getNumOfTires() {
        System.out.print("Car numOfTires is : ");
        return this.numOfTires;
    }

    public void start() {
        System.out.println(getNumOfTires()); //
        System.out.println(super.getNumOfTires());
        System.out.println("Car is Starting...");
    }

    public void displayColor() {
        System.out.println("Car color is : " + color); // calling the instance variable of child class;
        System.out.println("Vehicle color is : " + super.color); // calling the instance of parent class;
    }
}
