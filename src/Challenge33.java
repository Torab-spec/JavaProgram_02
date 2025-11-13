import java.util.Scanner;

public class Challenge33 {
    // GCD
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first number : ");
        int num1 = input.nextInt();
        System.out.print("Enter your second number : ");
        int num2 = input.nextInt();

        int gcd = GCD(num1, num2);
        System.out.println("The greatest common divider is : " + gcd);

    }

    public static int GCD(int num1, int num2) {
        // actual function which is doing actual logic
        int gcd = 1;
        int i = 2;
        int least = least(num1, num2);

        while (i <= least) {
            if ((num1 % i == 0) && (num2 % i == 0)) {
                gcd = i;
            }
            i++;
        }

        return gcd;
    }

    public static int least(int num1, int num2) {
        // This method works is to find which number is lowest ?
        if (num1 < num2) {
            return num1;
        } else {
            return num2;
        }

    }
}
