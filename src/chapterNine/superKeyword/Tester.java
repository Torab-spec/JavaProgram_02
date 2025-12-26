package chapterNine.superKeyword;

public class Tester {
    public static void main(String[] args) {
        System.out.println("1 ");
        Car car1 = new Car();
        System.out.println("2 ");

        Car car2 = new Car(4);
        System.out.println("3 ");

        car1.start();

        System.out.println("4 ");

        car2.start();
        System.out.println("5 ");
        car1.displayColor();

    }
}
