import java.util.Scanner;

public class Challenge29 {
    // sum of all odd number 1 to n
    public static void main(String[] args) {
        System.out.println("Welcome to odd number calculator");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter you number : ");
        int number = input.nextInt();
        int result = sumOfOddNumber(number);
        System.out.println("The sum of odd number is : " + result);

        int res = oddSum(number);
        System.out.println("The sum of odd number is : " + res);

    }

    public static int sumOfOddNumber(int num) {
        // myown
        int i = 1;
        int sum = 0;
        while (i <= num) {
            if (i % 2 != 0) {
                sum = sum + i;
            }
            i++;
        }
        return sum;
    }

    public static int oddSum(int num) {
        //prasanat sir
        int sum = 0;
        int i = 1;
        while (i <= num) {
            sum = sum + i;
            i += 2;
        }
        return sum;
    }
}

