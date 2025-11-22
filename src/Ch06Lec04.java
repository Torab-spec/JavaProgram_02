public class Ch06Lec04 {
    // lec49 -- Using Objects


    public static void main(String[] args) {
        // creating object of car class || This Car class come from Ch06Lec02
        Car myCar = new Car();
        myCar.drive();
        myCar.addFuel(5);
        myCar.drive();
        System.out.println(myCar.currentFuelInLitter);
        myCar.addFuel(10);
        myCar.drive();
        System.out.println(myCar.currentFuelInLitter);
        System.out.println(myCar.currentFuelInLitter);
        System.out.println(myCar.currentFuelInLitter);
        myCar.drive();
        System.out.println(myCar.currentFuelInLitter);
        myCar.drive();
        myCar.drive();
        myCar.drive();
        System.out.println(myCar.currentFuelInLitter);


    }
}
