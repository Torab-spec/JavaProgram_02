import java.util.Scanner;

public class Challenge26 {
    //use of right side operator
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter you number : ");
        int num = input.nextInt();
        int result = num >> 1;
        System.out.println(result);
    }
}
