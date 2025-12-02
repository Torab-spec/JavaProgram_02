import java.util.Scanner;

public class Challenge57 {
    //Print Month of the year;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your month number : ");
        int monthNum = input.nextInt();

        Challenge57 findingMonth = new Challenge57();
        System.out.println("Your month is " + findingMonth.findMonth(monthNum));


    }

    public String findMonth(int monthNum) {
        String month = switch (monthNum) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "Jun";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> " .Please enter a valid month number.";
        };
        return month;

    }
}
