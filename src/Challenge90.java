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
        sortInDescending(list);
        Utility2Collection.print(list);
    }

    public static void sortInDescending(List<String> list) {
//        Collections.sort(list);
//        Collections.reverse(list);
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        });
    }
}

