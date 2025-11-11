import java.util.Scanner;

public class Challenge18 {
    // Check leap year or not
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter year : ");
        int year = input.nextInt();

        if (year % 4 == 0 || (year % 400 == 0 && year % 100 != 0)) {
            System.out.println("Year is leap year");
        } else {
            System.out.println("Year is not leap year");
        }
    }
}
