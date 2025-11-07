import java.util.Scanner;

public class Challenge09 {
    // Challenge09 --> Adding floating number
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter you first floating number : ");
        float fNum1 = input.nextFloat();
        System.out.print("Enter your second floating number : ");
        float fNum2 = input.nextFloat();
        float fSum = fNum1 * fNum2;
        System.out.println("The product of two floating number is : " + fSum);


    }
}
