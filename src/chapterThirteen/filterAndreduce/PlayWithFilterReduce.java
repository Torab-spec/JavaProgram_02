package chapterThirteen.filterAndreduce;

import java.util.List;

public class PlayWithFilterReduce {
    public static void main(String[] args) {
        // Play with filter

        List<Integer> list = List.of(5, 12, 36, 55, 10);
        boolean isJavaFun = list.stream()
                .filter(n -> n > 10).isParallel();
        System.out.println(isJavaFun);
        int sum = list.stream().reduce(0, (a, b) -> a + b);
        System.out.println(sum);
    }
}
