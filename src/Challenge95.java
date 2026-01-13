import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Challenge95 {
    //    Write a program that takes a string and returns the number of unique characters using a Set
    public static void main(String[] args) {
        Set<Character> set = new HashSet<>();
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a character: ");
        String userStr = input.next();
        for (char ch : userStr.toCharArray()) {
            set.add(ch);
        }
        System.out.printf("Your string has %d unique characters.\n:", set.size());
    }
}
