package chapterEleven.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestingCollections {
    public static void main(String[] args) {
        List<Integer> numList = new ArrayList<>();
        numList.add(1);
        numList.add(2);
        numList.add(5);
        numList.add(4);
        numList.add(-45);
        Utility2Collection.print(numList);
        Collections.sort(numList);
        Utility2Collection.print(numList);
//        Collections.reverse(numList);
        Utility2Collection.print(numList);
        int searching = Collections.binarySearch(numList,1);
        System.out.println("The searching value is " + searching);
    }
}
