import java.util.Scanner;

public class Challenge21 {
    //Shows bitwise AND of two numbers
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your first number : ");
        int num1 = input.nextInt();
        System.out.print("Enter you second number : ");
        int num2 = input.nextInt();

        int result = num1 & num2;
        System.out.println("The result is : " + result);

    }
}
