package chapterNine.lecture02;

public class Tester {
    public static void main(String[] args) {
        Car car = new Car(4);
        System.out.println(car.getNumberOfTires());
        car.startMakeSound(); // using abstract method
        car.getSetGo(); // using abstract method form interface

    }
}
