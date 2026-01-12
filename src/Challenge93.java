import chapterEleven.collection.Utility2Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Challenge93 {
    //    11.93  -> Reverse the element of a list
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Utility2Collection.print(list);
//        Collections.reverse(list);
        reverse(list);
        Utility2Collection.print(list);

    }

    public static void reverse(List<Integer> list) {
        for (int i = 0; i < list.size() / 2; i++) {
            Challenge92.swap(list, i, list.size() - i - 1);
        }
    }
}
