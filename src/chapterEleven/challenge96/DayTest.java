package chapterEleven.challenge96;


public class DayTest {
    public static void main(String[] args) {
        // not a ideal process
        System.out.println(Day.MONDAY);
        System.out.println(Day.TUESDAY);
        System.out.println(Day.WEDNESDAY);
        System.out.println(Day.THURSDAY);
        System.out.println(Day.FRIDAY);
        System.out.println(Day.SATURDAY);
        System.out.println(Day.SUNDAY);
        System.out.println(" ");

        //ideal process
        for (Day value : Day.values()) {
            System.out.println(value);
        }
    }

}
