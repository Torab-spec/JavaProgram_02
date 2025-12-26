package chapterNine.polymorphism;

import javax.swing.tree.VariableHeightLayoutCache;

class TestTransportation {
    public static void main(String[] args) {
        // This part is for mySelfUnderStanding

        System.out.println("1");

//        Vehicle vehicle = new Vehicle();
        Car car = new Car();
        Plain plain = new Plain();
//        vehicle.start();
        car.start(); // start() is method of Vehicle class
        plain.start();

        System.out.println("2");

        car.carSound();//carSound() is a method of Plain class
        plain.plainSound();  //plainSound() is a method of Plain class

        System.out.println("3");

        Vehicle vCar = new Car(); // This is call upperCasting , This line says that 'Every Car is Vehicle' , that is always true that's why upperCasting is allowed,
        Vehicle vPlain = new Plain();

        vCar.start();
        // vCar.carSound();  // not allowed , because reference type is Vehicle (Parent) that's why we can't call Car (Child) class's attribute, we only can call Vehicle class attributes; We can call if we do downCasting , see line numbers - 64,78.79,80

        System.out.println("4");
        vPlain.start();
        // vPlain.plainSound(); // not allowed , because reference type is Vehicle (Parent) that's why we can't call Plain(Child) class's attribute, we only can call Vehicle class attributes;

        System.out.println("5");

        // Car cVeh = (Car) new Vehicle(); // This is call downCasting , This is not allowed in Java , it's through an error ,because this line says that 'Every Vehicle is a Car' , that can not true , it can be or can't be, downCasting is not allow in this way, If you sure that the Vehicle surely a Car then downCasting is allowed,

        // Achieving downCasting
       /*
        Car vCar2 = (Car) vCar;  // This is call downCasting, We can be achieving downCasting in this way
        vCar2.start();
        vCar2.carSound();
        Plain vPlain2 = (Plain) vPlain;
        vPlain2.start();
        vPlain2.plainSound();
        */


// This is one

//        castTest(vehicle);
//        castTest(car);
//        castTest(plain);

        System.out.println("6");

        // this is also another
//        castTest(vCar);
//        castTest(vPlain);

        System.out.println("7");

        // castTest(vCar); // downCasting through castTest() method.

        System.out.println("8");

        castTest(vCar);
        castTest(vPlain);  // call only one method but its response according to their argument;

    }

    // Achieving downCasting

    public static void castTest(Vehicle v) {
        v.start();

//        Car vCars = (Car) v;
//        vCars.start();     // Achieving downCasting ,
//        vCars.carSound();
    }
}

// Every Vehicle is not a Car , but every Car is a Vehicle