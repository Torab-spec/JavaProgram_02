package chapterEleven.collection;

import java.util.Collection;

public class Utility2Collection {
    public static <E> void print(Collection<E> collection) {
        System.out.print("Collection is : " );
        for (E i : collection) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
    }
}
