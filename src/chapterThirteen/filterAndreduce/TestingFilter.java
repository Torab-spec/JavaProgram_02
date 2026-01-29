package chapterThirteen.filterAndreduce;

import java.util.List;
import java.util.function.Consumer;

public class TestingFilter {
    public static void main(String[] args) {
        List<String> fruits = List.of("Apple", "Banana", "Mango", "Date");

        System.out.printf("Fruits size is %d\n", fruits.size());
        System.out.println("Printing Fruit normally ");
        for (String fruit : fruits) {
            System.out.print(fruit + " ");
        }

        System.out.println("\n Printing Fruit with stream");
        fruits.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String fruit) {
                System.out.print(fruit + " ");
            }
        });
//        System.out.println("\n Printing Fruit with lambda expression & Filter");
        fruits.stream()
                .filter(fruit -> fruit.endsWith("e"))
                .forEach(fruit -> System.out.print(fruit + " "));

        List<Integer> listNum = List.of(1, 2, 3);
        listNum.stream();

    }
}
// 1. Terminal operation -> Which didn't return anything, ex: forEach/collection

// 2. Lazy operation -> which return something , it is not able to work alone , its always work with terminal operation, ex:filter
// 10.4.00 - reduce

// 3. Uses of lambda - i. when we need to pass a function as an argument in a method , ii.  when we need to store function in a variable, iii. when we need to return a function

// 4. If we need to store lambda expression in a variable then the variable must be of functional Interface
