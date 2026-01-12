import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Challenge91 {
    //11.91 -> Count the frequency of a particular element in an ArrayList using Collections class
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 1, 1, 2, 2, 3);

        System.out.println("Frequency of 1 is - " + Collections.frequency(list, 1));
        System.out.println("Frequency of 1 is - " + Collections.frequency(list, 2));
        System.out.println("Frequency of 1 is - " + Collections.frequency(list, 3));
    }

}
