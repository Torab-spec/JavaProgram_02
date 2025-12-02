import java.util.Scanner;

public class Challenge53 {
    //Find the Minimum of Two number
    public static void main(String[] args) {
        System.out.println(" ");

        notes();

        System.out.println(" ");

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your 1st number : ");
        int num1 = input.nextInt();
        System.out.print("Enter your 2nd number : ");
        int num2 = input.nextInt();

        Challenge53 ternary = new Challenge53();
        int min = ternary.findMin(num1, num2);
        System.out.println("The minimum number is : " + min);


    }

    public int findMin(int num1, int num2) {
        return num2 > num1 ? num1 : num2;
    }

    public static void notes() {
        System.out.println("Static method a non-static method k call kora \n jai na , static method a non-static method k call korte gale \n object create kore call korte hoi findMin() holo non-static method \n tai eke direct call kora jabe na , object create kore call korte \n hobe , aber ei notes() static method ta k object create na kore \n direct call kora jabe ");
    }
}

