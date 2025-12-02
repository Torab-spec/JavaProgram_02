import java.util.Scanner;

public class Challenge54 {
    //Given number is even or odd?
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your 1st number : ");
        int num1 = input.nextInt();

        Challenge54 oddEven = new Challenge54();

        String result = oddEven.oddEven(num1);
        System.out.println("Your number is " + result);

    }

    public String oddEven(int num) {
        return num % 2 == 0 ? "Even" : "Odd";
    }
}
