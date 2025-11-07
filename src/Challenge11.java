import java.util.Scanner;

public class Challenge11 {
    // Area of Triangle
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Base : ");
        double base = input.nextDouble();

        System.out.print("Enter Height : ");
        double height = input.nextDouble();

        double area = 1/2f * (base*height);
        System.out.println("The Area is : " + area);


    }
}
