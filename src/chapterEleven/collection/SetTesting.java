package chapterEleven.collection;

import java.util.HashSet;
import java.util.Set;

public class SetTesting {
    public static void main(String[] args) {
        Set<String> set= new HashSet<>();
        System.out.println(set.add("Abu"));
        System.out.println(set.add("Torab"));
        System.out.println(set.add("Uddin"));
        System.out.println(set.add("Uddin"));

        Utility2Collection.print(set);
    }
}
