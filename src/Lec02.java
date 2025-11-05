import java.util.Scanner;

public class Lec02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Scanner is object which is store in JRE |
        // input is an object of Scanner object | which is created by me

        System.out.print("Enter you Name : ");
        String name = input.nextLine();
        // nextLine() is method of input object
        // name is variable which stored the value to nextLine() method
        // <input.nextLine() --> for access the nextLine() method>
        System.out.println("your name is " + name);
    }
}
