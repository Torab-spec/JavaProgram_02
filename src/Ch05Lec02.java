import java.util.Scanner;

public class Ch05Lec02 {
    // lec:40 --> What is loop in java
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter you number : ");
        int i = 1;
        int len = input.nextInt();

        while (i <= len) {
            System.out.print(i + " ");
            i++;
        }
    }
}
