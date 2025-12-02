import java.util.Optional;
import java.util.Scanner;

public class Challenge58 {
    //Simple calculator using Switch;
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your 1st number : ");
        int num1 = input.nextInt();
        System.out.print("Enter your 2nd number : ");
        int num2 = input.nextInt();
//        input.nextLine();
        System.out.print("Enter operation : ");
        String operation = input.next();

        int result = calculator(num1, num2, operation);
        System.out.println("Your result is : " + result);


    }


    public static int calculator(int num1, int num2, String operation) {

        return switch (operation) {
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "*" -> num1 * num2;
            case "/" -> num1 / num2;
            default -> 0;
        };
    }
}
