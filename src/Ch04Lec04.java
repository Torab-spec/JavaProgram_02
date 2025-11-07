import java.util.Scanner;

public class Ch04Lec04 {
    //ShortHand operator
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.print("Enter A : ");
        int a = input.nextInt();
        System.out.println("Value of A : " + a);

        a += 10;
        System.out.println("Next value of A : " + a);



    }
}
