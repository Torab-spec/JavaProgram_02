import java.util.Scanner;

public class Challenge38 {
    //Check palindrome
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int num = input.nextInt();
        boolean isPalindrome = checkPalindrome(num);
        if (isPalindrome) {
            System.out.println("yes ! it is palindrome");
        } else {
            System.out.println("No ! it is not palindrome");
        }

    }

    public static boolean checkPalindrome(int num) {

        int copyNum = num;
        int reverseNumber = 0;
        int i = 0;

        while (i < num) {
            int lasDigit = num % 10;
            reverseNumber = reverseNumber * 10 + lasDigit;
            num = num / 10;
        }
        return reverseNumber == copyNum;
    }
}
