import java.util.Scanner;

public class Challenge27 {
    //Checking the is Odd or Even using Bitwise operator
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your number : ");
        int num = input.nextInt();

        if ((num & 1) == 0) {
            System.out.println("Your number is even");
        } else {
            System.out.println("Your number is odd");
        }

    }
}
