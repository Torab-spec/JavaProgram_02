import java.util.Scanner;

public class Ch10Lec01 {
    //Ch10.1 -> What is Exception
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your 2nd number ");
        //Enter num1 between 1 to 100
        int num1 = input.nextInt();
        System.out.print("Enter your 1st number ");
        //Enter num2 as 0
        // Then only we get exception
        int num2 = input.nextInt();

        int result = num1 / num2;
        System.out.printf("Your result is %d", result);

        // Don't correct the code ,
    }
}
