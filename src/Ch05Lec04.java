import java.util.Scanner;

public class Ch05Lec04 {
    //lec:42 --> Return Statement
    public static void main(String[] args) {

        int fNumber = getNum();
        int sNumber = getNum();
        int sum = fNumber + sNumber;
        System.out.println("The sum of the number is : " + sum);

    }

    public static void greet() {
        System.out.println("Welcome to my calculator");
    }

    public static int getNum() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your number : ");
        int number = input.nextInt();
        return number;

    }
}
