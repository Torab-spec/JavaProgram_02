import java.util.Scanner;

public class Challenge61 {
    //61 --> Multiplication table
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int num = input.nextInt();
        System.out.println(" ");
        System.out.println("Your multiplicationTable for " + num + " is : ");
        multiplicationTable(num);
    }

    public static void multiplicationTable(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.print(num * i + " ");
        }
    }
}
