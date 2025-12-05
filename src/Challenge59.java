import java.util.Scanner;

public class Challenge59 {
    //59. Password checker
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String password;
        do {
            System.out.print("Please enter your password ");
            password = input.next();
        } while (!isValidPassword(password));
        // for using not (!) operator true convert into false and false convert into true;
        System.out.println("Thanks for entering valid password");
    }

    public static boolean isValidPassword(String pass) {
        return pass.length() > 6;  // this method return true/false
    }
}
