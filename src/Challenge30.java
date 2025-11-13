import java.util.Scanner;

public class Challenge30 {
    //Calculating factorial

    public static void main(String[] args) {
        System.out.println("welcome to factorial");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter you number : ");
        int number = input.nextInt();
        long factorials = factorial(number);
        System.out.println("The factorial of " + number + " is : " + factorials);
        System.out.println(" ");
        long pfactrials = pFactorial(number);
        System.out.println("The factorial of " + number + " is : " + pfactrials);


    }

    public static long factorial(int num) {
        //my own
        if (num == 0) {
            return 1;
        } else {
            int i = 1;
            long facto = 1;
            while (i <= num) {
                facto = facto * i;
                i++;
            }
            return facto;
        }
    }


    public static long pFactorial(int num) {
        //prasnant sir
        if (num < 2) {
            return 1;
        }
        long facto = 1;
        int i = 2;

        while (i <= num) {
            facto = facto * i;
            i++;
        }
        return facto;
    }

}
