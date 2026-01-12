import chapterEleven.collection.Utility2Collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Challenge90 {
    //11.90 -> Custom comparator
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Bear", "Dear", "Ant", "Elephant");
        Utility2Collection.print(list);
        cusSortInDescending(list);
//        colSortInDescending(list);
        Utility2Collection.print(list);
    }

    public static void colSortInDescending(List<String> list) {
        Collections.sort(list);
        Collections.reverse(list);
    }

    public static void cusSortInDescending(List<String> list) {
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if (s1.equals(s2)) {
                    return 0;
                } else if (s1.charAt(0) < s2.charAt(0)) {
                    return 1;

                } else {
                    return -1;
                }
            }
        });
    }
}

