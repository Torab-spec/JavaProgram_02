import java.util.Scanner;

public class Ch07Lec10 {
    //Ternary operator
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your 1st number ");
        int num1 = input.nextInt();
        System.out.print("Enter your 2nd number ");
        int num2 = input.nextInt();
        int greaterNum;
        /*
        if (num1 > num2) {
            greaterNum = num1;
        } else {
            greaterNum = num2;
        }
        System.out.println(greaterNum + " number is greater");
        */
        greaterNum = num1 > num2 ? num1 : num2;
        System.out.println(greaterNum + " number is greater");

    }
}
