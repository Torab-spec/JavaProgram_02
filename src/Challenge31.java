import java.util.Scanner;

public class Challenge31 {
    // sum of digits
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter you number : ");
        int number = input.nextInt();
        int sum = sumOfDigits(number);
        System.out.println("The sum of " + number + " digits : " + sum);
    }

    public static int sumOfDigits(int num) {
        //Prasant sir
        int sum = 0;
        while (num > 0) {
            int reminder = num % 10;
            sum = sum + reminder;
            num = num / 10;

        }
        return sum;
    }
}
