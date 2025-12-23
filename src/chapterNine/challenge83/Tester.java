package chapterNine.challenge83;

public class Tester {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Square square = new Square(10.3);
        System.out.printf("Area of circle: %5.2f\n", circle.calculateArea());
        System.out.printf("Area of square: %5.2f\n", square.calculateArea());
    }
}
