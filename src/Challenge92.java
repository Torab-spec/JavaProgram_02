import chapterEleven.collection.Utility2Collection;

import java.util.Arrays;
import java.util.List;

public class Challenge92 {
    //    11.92 -> Swapping two element in an ArrayList
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        Utility2Collection.print(list);
        swap(list, 1, 2);
        Utility2Collection.print(list);
    }

    public static void swap(List<Integer> list, int x, int y) {
        int swap = list.get(x);
        list.set(x, list.get(y));
        list.set(y, swap);
    }
}
