import java.util.Scanner;

public class Challenge34 {
    // Checking prime or not
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your  number : ");
        int number = input.nextInt();
        boolean checkPrime = prime(number);

        if (checkPrime){
            System.out.println( number + " number is prime");
        }else {
            System.out.println( number + " number is not prime");
        }

    }

    public static boolean prime(int num) {
        int i = 2;
        while (i < num) {
            if (num % i == 0) {
                return false;
            }
            i++;
        }
        return true;

    }
}
