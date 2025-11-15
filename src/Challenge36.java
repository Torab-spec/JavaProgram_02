import java.util.Scanner;

public class Challenge36 {
    // Fibonacci Series
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter you number : ");
        int number = input.nextInt();
        fibonacci(number);

    }

    public static void fibonacci(int num) {
        // if the number is less than zero or the number is zero
        if (num < 0) {
            System.out.println("0 ");
            return;
        }
        if (num == 0) {
            System.out.println("1 ");
            return;
        }

        // now print the fibonacci if the given number is not zero

        int first = 0, second = 1;

        while (first + second <= num) {
            int third = first + second;
            System.out.print(third + " ");
            first = second;
            second = third;
        }
    }
}
