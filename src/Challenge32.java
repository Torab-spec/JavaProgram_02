import java.util.Scanner;

public class Challenge32 {
    //LCM
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first number : ");
        int num1 = input.nextInt();
        System.out.print("Enter your second number : ");
        int num2 = input.nextInt();

        int lcm1 = lcm1(num1, num2);
        System.out.println("The least common number is : " + lcm1);

        int lcm2 = lcm1(num1, num2);
        System.out.println("The least common number is : " + lcm2);


    }

    public static int lcm1(int num1, int num2) {
//    Approach one
        int i = 1;
        int count = num1 * num2;
        int lcm = 0;
        while (i <= count) {
            if ((i % num1 == 0) && (i % num2 == 0)) {
//                lcm = i;
//                break;
                return i;
            }
            i++;
        }
//        return lcm;
        return 0; // unreachable || after line 30 , the below line code never execute because of return statement
    }


    public static int lcm2(int num1, int num2) {
//    Approach two

        int i = 1;
        int num1Mul = 0;
        while (true) {
            num1Mul = num1 * i;
            if (num1Mul % num2 == 0) {
                return num1Mul;
            }

            i++;
        }
    }
}
