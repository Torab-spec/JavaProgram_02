import java.util.Scanner;

public class Challenge60 {
    // 60 -> Number guessing game
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int randomNumber = randomNumber();
        int guessNumber;
        do {
            System.out.print("Guess the number : ");
            guessNumber = input.nextInt();
        } while (randomNumber != guessNumber);

        System.out.println(" ");
        System.out.println("Yahoo...! Your guessing is right");
        System.out.println("Random number is " + randomNumber);
        System.out.println("Your numbe is " + guessNumber);
    }

    public static int randomNumber() {
        // Define the range
        int min = 1;
        int max = 10;
        // The formula to generate an integer between min (inclusive) and max (inclusive) is:
        // (int)(Math.random() * (max - min + 1) + min)

        // int randomNumber = (int) (Math.random() * (max - min + 1) + min);

        return (int) (Math.random() * (max - min + 1) + min);

    }
}
