import java.util.Scanner;

public class Challenge17 {
    //that determines the greatest of the three number
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your numbers : ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        if (num1 >= num2 && num1 >= num3) {
            System.out.println("The greater num is " + num1);
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("The greater num is " + num2);
        } else {
            System.out.println("The greater num is " + num3);
        }

    }
}
