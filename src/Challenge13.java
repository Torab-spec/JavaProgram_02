import java.util.Scanner;

public class Challenge13 {
    // calculate Compound interest.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter principle amount : ");
        int principleAmount = input.nextInt();

        System.out.print("Enter Time : ");
        float time = input.nextFloat();

        System.out.print("Enter Rete : ");
        float rate = input.nextFloat();

        double interest = principleAmount* Math.pow((1 + rate/100),time);
        System.out.println("Interest is : " + interest);
    }
}
