import java.util.Scanner;

public class Challenge55 {
    //absolute value of given integer
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your 1st number : ");
        int num1 = input.nextInt();


        int result = num1 >= 0 ? num1 : -num1;
        System.out.println("Absolute value of the given number is : " + result);
    }
}
