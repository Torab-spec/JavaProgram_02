import java.util.Scanner;

public class Challenge72 {
    // 72 ->  Calculating Area & circumference of a Circle
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius ");
        double radius = input.nextDouble();
        Circle circle = new Circle(radius);
        System.out.println(circle);
    }
}

class Circle {

    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double getCircumference() {
        return 2 * Math.PI * radius;
    }

    double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public String toString() {
        return "Circle Attribute : Your Radius is : " + this.radius + " " +
                "Circumference is : " + getCircumference() + " " +
                "Area is " + getArea();
    }

}
