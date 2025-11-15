import java.util.Scanner;

public class Challenge37 {
    // Check the number is Armstrong or not
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter you num : ");
        int num = input.nextInt();

        boolean checkAs = isArmstrong(num);

        if (checkAs) {
            System.out.println("The number is Armstrong");
        } else {
            System.out.println("The number is not Armstrong");
        }


    }

    public static boolean isArmstrong(int num) {
        int numCopy = num; // we work with this variable otherwise the original value is updated , and the ans is not come ;

        int calculateDigit = calculateDigit(num);
        int finalNumber = 0;
        int i = 0;

        while (i < num) {
            int lastDigit = num % 10; // Store the most right digit
            num = num / 10;

            finalNumber = finalNumber + power(lastDigit, calculateDigit);
        }

        return finalNumber == numCopy;
    }

    public static int calculateDigit(int num) {
        int i = 0;
        int countDigit = 0;
        while (i < num) {
            countDigit++;
            num = num / 10;
        }
        return countDigit;
    }

    public static int power(int num1, int num2) {

        int i = 0;
        int result = 1;

        while (i < num2) {
            result = result * num1;
            i++;
        }

        return result;
    }

}
