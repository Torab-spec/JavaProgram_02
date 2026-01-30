package chapterThirteen.challenges;

import java.util.function.BinaryOperator;

public class LambdaMultiplication {
    public static void main(String[] args) {
        BinaryOperator<Integer> multi = (a, b) -> a * b;
        int result = multi.apply(11, 2);
        System.out.println(result);
    }
}
