import java.util.Scanner;

public class Ch07Lec04 {
    //For loop | P:155;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your number : ");
        int num = input.nextInt();

        System.out.println(" ");
        System.out.println("Find factorial using Iterative way");
        System.out.println("Factorial of " + num + " is " + factorialIterative(num));

        System.out.println(" ");

        System.out.println("Factorial using Recursive way");
        System.out.println("Factorial of " + num + " is " + recursiveFactorial(num));


    }

    //A
    public static long factorialIterative(int num) {
        int facto = 1;
        for (int i = 1; i <= num; i++) {
            facto = i * facto;
        }
        return facto;
    }

    //B
    public static long recursiveFactorial(int num) {
        if (num == 1) {
            return 1;
        }
        System.out.println(num);
        return num * recursiveFactorial(num - 1);
    }


}
