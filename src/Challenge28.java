import java.lang.classfile.Attributes;
import java.util.Scanner;

public class Challenge28 {
    // Multiplication table
    public static void main(String[] args) {
        System.out.println("Welcome to multiplication table : ");
//        mulTable();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int number = input.nextInt();
        multiplicationTable(number);


    }

    public static void mulTable() {
        // my own
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int i = 1;
        int n = input.nextInt();
        int m = 10;

        while (i <= m) {
            int mul = i * n;
            i++;
            System.out.print(mul + " ");
        }
    }


    public static void multiplicationTable(int num) {
        //prasant sir
        int i = 1;
        int index = 10;
        while (i <= index) {
            int result = num * i;
            System.out.println(num + " X " + i + " = " + result);
            i++;
        }

    }
}
