package chapterThirteen.filterAndreduce;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class TestingReduce {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7);
        int sum = 0;
        for (Integer integer : numbers) {
            sum += integer;
        }
        System.out.printf("Normal sum : %d\n", sum);

        int newSum = numbers.stream()
                .reduce(0, new BinaryOperator<Integer>() {
                    @Override
                    public Integer apply(Integer integer, Integer integer2) {
                        return integer + integer2;
                    }
                });

        System.out.printf("\n sum using stream: %d\n", newSum);

        int newSum2 = numbers.stream().reduce(0, (a, b) -> a + b);
        System.out.printf("\n sum using lambda reduce: %d\n", newSum2);

    }
}
