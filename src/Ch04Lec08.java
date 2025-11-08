import java.util.Scanner;

public class Ch04Lec08 {
    //Logical operators
    public static void main(String[] args) {

        boolean x = true;
        System.out.println(x);
        System.out.println(!x);


        Scanner input = new Scanner(System.in);

        System.out.print("Enter your age : ");
        int age = input.nextInt();
        input.nextLine();
        System.out.print("Enter your gender : ");
        String gender = input.nextLine();

        String m = "male";
        String f = "female";

        if (age <= 5) {
            System.out.println("You got 75% discount");
        } else if (age <= 50 && m.equals(gender)) {
            System.out.println("You got 30% discount");
        } else if (age <= 45 && f.equals(gender)) {
            System.out.println("You got 50% discount");
        } else {
            System.out.println("You have no discount");

        }
        input.close();

    }

}
