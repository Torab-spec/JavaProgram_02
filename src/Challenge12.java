import java.util.Scanner;

public class Challenge12 {
    //calculate simple interest.
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter principle amount : ");
        int principleAmount = input.nextInt();

        System.out.print("Enter Time : ");
        float time = input.nextFloat();

        System.out.print("Enter Rete : ");
        float rate = input.nextFloat();

        float interest = (principleAmount*time*rate) /100;
        System.out.println("Interest is : " + interest);

    }
}
