package chapterEight.challenge77.utils;

import chapterEight.challenge77.gerometry.Circle;
import chapterEight.challenge77.gerometry.Rect;

public class Calculator {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rect rect = new Rect(10, 5);

        double circleArea = Math.PI * Math.pow(circle.radius, 2);
        int rectArea = rect.length * rect.breadth;


        System.out.println("Area of circle is : " + circleArea);
        System.out.println("Area of rectangle is : " + rectArea);

    }
}
