package chapterThirteen.playWithLEAndFI;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class PlayWithFI {
    public static void main(String[] args) {
        // filter and test
        //*************************************************************
        // The Predicate: Rule to check if a number is Even
        Predicate<Integer> isEven = n -> n % 2 == 0;
        // Manually calling the test() method
        System.out.println(isEven.test(10)); // Output: true
        System.out.println(isEven.test(7));  // Output: false
        //------------------------------------------------------
        List<Integer> numbers = List.of(5, 12, 8, 21, 30, 7);
        // .filter() is the Partner of test()
        // n -> n > 10 is the logic that goes into test()
        List<Integer> filteredNumbers = numbers.stream()
                .filter(n -> n > 10)
                .toList();
        System.out.println(filteredNumbers); // Output: [12, 30]

        // map and apply
        //******************************************************************
        // Function<InputType, OutputType>
        // Logic: Takes a Number, returns a String
        Function<Integer, String> converter = (num) -> "The number is: " + num;
        // Manually calling the apply() method
        String result = converter.apply(50);
        System.out.println(result); // Output: The number is: 50
        //-----------------------------------------------------------------
        List<Integer> prices = List.of(100, 500, 1000);
        List<String> formatted = prices.stream()
                .map(p -> "$" + p + ".00") // apply() handles the String concatenation
                .toList();
        System.out.println(formatted); // Output: [$100.00, $500.00, $1000.00]

        // accept and forEach
        //****************************************************************
        List<Integer> number = List.of(10, 20, 30);
        // .forEach() is the Partner
        // n -> System.out.println(n) is the logic inside the accept() method
        number.stream()
                .forEach(n -> System.out.println("Final Output: " + n));
        //-----------------------------------------------------
        List<String> names = List.of("Java", "Stream", "Accept");
        // This is the ultimate "Fix java" shorthand for accept()
        names.forEach(System.out::println);
        //*******************************************************
    }
}
