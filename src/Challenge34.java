import java.util.Scanner;

public class Challenge34 {
    // Checking prime or not
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your  number : ");
        int number = input.nextInt();
        prime(number);
    }

    public static void prime(int num) {
        int i = 2;
        while (i < num) {
            if (num % i == 0) {
                System.out.println("This is not prime number");
                break;
            } else {
                System.out.println("This is  prime number");
            }
            i++;
        }

    }
}
