import java.util.Scanner;

public class Ch10Lec05 {
    //10.5 -> Finally block
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number ");
        int num2 = input.nextInt();

        try {
            int res = num1 / num2;
            System.out.println("The result is " + res);
        } catch (ArithmeticException e) {
            System.out.printf("%s please enter numeric value ", e.getMessage());
            System.out.println(" ");
        } finally {
            System.out.println("I am from finally");
        }
    }
}
