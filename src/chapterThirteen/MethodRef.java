package chapterThirteen;

import java.util.ArrayList;
import java.util.List;

public class MethodRef {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5);

        list.forEach(n -> System.out.print(n)); //Normal Reference

        System.out.println(" ");
        list.forEach(System.out::print); // Method Reference
    }
}
