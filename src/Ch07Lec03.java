import java.util.Scanner;

public class Ch07Lec03 {
    // do-while loop | p : 154;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
/*
        System.out.print("Enter your age : ");
        int age = input.nextInt();
        while (age < 0 || age > 100) {
//A
            System.out.print("Enter your age : ");
            age = input.nextInt();
        }
        System.out.println("Your age is : " + age);
*/

        int age;
        do {
//B
            System.out.print("Enter your age : ");
            age = input.nextInt();
        } while (age < 0 || age > 100);
        System.out.println("Your age is : " + age);

    }
}
