import java.util.Scanner;

public class Challenge56 {
    // Student Score Categorization as High, Moderate, low
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your score : ");
        int score = input.nextInt();

        String result = score > 80 ? "High" : (score > 50 ? "Moderate" : "Low");

        System.out.println("You are in " + result + " Category");


    }
}
