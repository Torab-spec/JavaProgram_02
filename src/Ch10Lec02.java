import java.util.Scanner;

public class Ch10Lec02 {
    // 10.2 -> Try - Catch
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your 2nd number ");
        int num1 = input.nextInt();
        System.out.print("Enter your 1st number ");
        int num2 = input.nextInt();


        try {
            int result = num1 / num2;
            System.out.printf("Your result is %d", result);
            //jodi exception na ase tahole try block execute hobe
        } catch (ArithmeticException e) {
            System.out.printf("%s, Please enter a numeric value", e.getMessage());

            // exception asle catch block execute hobe
        }

    }
}
