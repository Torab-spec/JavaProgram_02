package chapterEleven.maps;

import java.util.HashMap;
import java.util.Map;

public class TestingMaps {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        System.out.println(map.size());
        System.out.println(map.get("one"));
        System.out.println(map.containsKey("one"));
        System.out.println(map.containsKey("four"));
        System.out.println(map.remove("three"));
        System.out.println(map.size());

        map.forEach((k, v) -> System.out.println(k + ": " + v));
        map.keySet().forEach(k -> System.out.println(k + ": " + map.get(k)));
        //iterating map object
        System.out.println("iterating map object");
        for (String s : map.keySet()) {
            System.out.println(s + " : " + map.get(s));
        }
    }
}
