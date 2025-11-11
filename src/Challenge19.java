import java.util.Scanner;

public class Challenge19 {
    //calculates grades based on marks
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter marks : ");
        float marks = input.nextFloat();

        if (marks > 90) {
            System.out.println("Great ! You have got A " + marks + "%");
        } else if (marks > 75) {
            System.out.println("Great ! You have got B " + marks + "%");
        } else if (marks > 60) {
            System.out.println("Great ! You have got C " + marks + "%");
        } else if (marks > 30) {
            System.out.println("You have got D " + marks + "%");
        } else if (marks < 30) {
            System.out.println("Oops ! Try hard , Better luch next time " + marks + "%");

        }


    }
}
