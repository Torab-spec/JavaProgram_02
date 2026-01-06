import java.util.Scanner;

public class Challenge87 {
    //ch87 - see  P : 226
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your 1st number ");
        int num1 = input.nextInt();
        System.out.print("Enter your 2nd number ");
        int num2 = input.nextInt();

        try {
            int result = num1 / num2;
            System.out.println("Your result is: " + result);
        } catch (ArithmeticException exception) {
            if (exception.getMessage().equals("/ by zero")) {
                System.out.println("Divid by zero occured");
                }
            else {
                throw exception;
            }
        }
    }
}
