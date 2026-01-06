package chapterTen.throwsThrow;

import java.util.Scanner;

public class Throw {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age ");
        int age = input.nextInt();

        if (age < 18) {
            throw new ArithmeticException("Access Denied . You are kid"); // using throw

        } else {
            System.out.println("Access Granted");
        }
    }

}
