import java.util.Scanner;

public class Challenge16 {
    //Determining is the number odd or even

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int num = input.nextInt();

        if (num % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd" );
        }

    }
}

