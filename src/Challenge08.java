import java.util.Scanner;

public class Challenge08 {
       // Challenge08 --> Playing with arithmetic operators
       public static void main(String[] args) {
           Scanner input = new Scanner(System.in);

           System.out.print("Enter your first number : ");
           int num1 = input.nextInt();

           System.out.print("Enter your second number : ");
           int num2 = input.nextInt();

           int sum = num1 + num2;
           System.out.println("Result of (+) operators : " + sum);
           int sub = num1-num2;
           System.out.println("Result of (-) operators : " + sub);
           int mul = num1*num2;
           System.out.println("Result of (*) operators : " + mul);
           int dive = num1/num2;
           System.out.println("Result of (/) operators : " + dive);
           int mod = num1%num2;
           System.out.println("Result of (%) operators : " + mod);




       }
}
