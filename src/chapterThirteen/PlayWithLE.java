package chapterThirteen;

import java.util.Scanner;

@FunctionalInterface
interface Sum {
    int add(int a, int b);
}

@FunctionalInterface
interface Greeting {
    void greeting(String greet);
}

@FunctionalInterface
interface Gn8 {
    String gn8(String greet);
}

public class PlayWithLE {
    public static void main(String[] args) {

        Sum sum = (a, b) -> a + b;
        System.out.println(sum.add(3, 4));

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your msg : ");
        String msg = input.nextLine();
        Greeting sayHello = sms -> System.out.println(sms);
        System.out.print("Your msg is : ");
        sayHello.greeting(msg);

        System.out.print("Enter your Goodnight msg : ");
        String sayNight = input.nextLine();

        Gn8 goodnight = sayNights -> sayNights;
        System.out.print(goodnight.gn8(sayNight));




    }
}
