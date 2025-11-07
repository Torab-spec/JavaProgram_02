import java.sql.SQLOutput;
import java.util.Scanner;

public class Challenge10 {
    //Perimeter of a rectangle.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter all sides of rectangle : ");
        double firstSide = input.nextDouble();
        double SecondSide = input.nextDouble();
        double thirdSide = input.nextDouble();
        double fourthSide = input.nextDouble();
        System.out.println("The perimeter of the rectangle : " + (firstSide + SecondSide + thirdSide + fourthSide));
    }
}
