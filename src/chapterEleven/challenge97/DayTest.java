package chapterEleven.challenge97;


public class DayTest {
    public static void main(String[] args) {

        Day day0 = Day.MONDAY;

        if (day0.laborDay()) {
            System.out.println(day0 + " is a working day");
        } else {
            System.out.println(day0 + " is not a working day");
        }


        System.out.println(" ");

        for (Day day1 : Day.values()) {
            if (day1.laborDay()) {
                System.out.println(day1 + " is a working day");
            } else {
                System.out.println(day1 + " is not a working day");
            }
        }
        System.out.println(" ");
        //ideal process
        for (Day day : Day.values()) {
            System.out.printf("%s : %s \n", day, day.getType());
        }
    }

}
