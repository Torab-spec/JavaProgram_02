import java.util.Scanner;

public class Challenge67 {
    //67 --> Print only even number
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int num = input.nextInt();
        printEven(num);

    }

    public static void printEven(int num) {
        for (int i = 1; i <= num; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.print(i + " ");
        }


    }
}
