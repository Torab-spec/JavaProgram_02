package chapterEleven.collection;

import java.util.ArrayList;
import java.util.List;

public class TestingList {
    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();
        strList.add("Md ");
        strList.add("Torab ");
        strList.add(1, "Abu");
        strList.add("Uddin");
        System.out.print(strList.get(0));
        System.out.print(strList.get(1));
        System.out.print(strList.get(2));
        System.out.println(strList.get(3));
        System.out.println("Iterating list using For loop");
        for (int i = 0; i < strList.size(); i++) {
            System.out.println(i + ". " + strList.get(i));
        }
        for (String o : strList) {
            System.out.print(o);
        }


    }
}
