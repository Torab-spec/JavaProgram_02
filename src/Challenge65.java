import javax.annotation.processing.SupportedSourceVersion;
import java.util.Objects;
import java.util.Scanner;

public class Challenge65 {
    //Reade user input
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String command;
        while (true) {
            System.out.println("Enter your command ");
            command = input.nextLine();
            if (command.equalsIgnoreCase("exit")) {
                break;
            }
        }
        System.out.println("You have successfully exit");

    }
}
