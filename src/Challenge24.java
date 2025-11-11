import java.util.Scanner;

public class Challenge24 {
    //Bitwise compliment
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Numbers : ");
        int num = input.nextInt();

        int result = ~num;
        System.out.println("The result is " + (-result));

    }
}
