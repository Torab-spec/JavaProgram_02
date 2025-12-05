import java.util.Scanner;

public class Challenge62 {
    //62 -> Prime or not

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your  number : ");
        int number = input.nextInt();
        boolean checkPrime = prime(number);

        System.out.println("Your number is " + (checkPrime ? "Prime" : "Not Prime"));

    }

    public static boolean prime(int num) {

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;

    }
}
