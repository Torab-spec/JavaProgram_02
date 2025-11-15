import java.util.Scanner;

public class Challenge35 {
    // reverse the digits
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter you number : ");
        int number = input.nextInt();
        int reverseDigit = reverseDigit(number);
        System.out.println("The reverse of " + number + " is : " + reverseDigit);

    }

    public static int reverseDigit(int num) {
        //Prasant sir
        int newNum = 0;
        while (num > 0) {
            int digit = num % 10;
            newNum = newNum * 10 + digit;
            num = num / 10;
        }
        return newNum;
    }
}
