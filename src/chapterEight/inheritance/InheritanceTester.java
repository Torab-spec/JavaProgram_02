package chapterEight.inheritance;

public class InheritanceTester {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.commute();

        System.out.println(" ");

        TwoWheeler twoWheeler = new TwoWheeler();
        twoWheeler.commute();
        twoWheeler.balance();

        System.out.println(" ");

        MotorCycle motorCycle = new MotorCycle();
        motorCycle.commute();
        motorCycle.balance();
        motorCycle.start();

    }
}
