import java.util.Scanner;

public class Challenge07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter  A : ");
        int a = input.nextInt();
        System.out.print("Enter  B : ");
        int b = input.nextInt();

        int c;

        c = a;
        a = b;
        b = c;
        System.out.println("Swapping done...");
        System.out.println("Swapped A " + a);
        System.out.println("Swapped B " + b);


    }
}
