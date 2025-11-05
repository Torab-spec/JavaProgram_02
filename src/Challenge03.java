import java.util.Scanner;

public class Challenge03 {
    public static void main(String[] args) {
        //1st Challenge

        Scanner input = new Scanner(System.in);
        /*
        System.out.print("Enter you Name : ");
        String name = input.nextLine();
        System.out.println("Welcome " + name + " to KG coding");
        */

        // 2nd Challenge
        System.out.print("Enter first Number : ");
        int fNum = input.nextInt();
        System.out.print("Enter second Number : ");
        int sNum = input.nextInt();
        int sum = (fNum+sNum);
        System.out.print("The sum of two number is ");
        System.out.println(sum);



    }
}
