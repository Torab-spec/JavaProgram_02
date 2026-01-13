package chapterEleven.enums;

public class TestingEnum {
    public static void main(String[] args) {
        TrafficLight color = TrafficLight.RED;
        color = TrafficLight.GREEN;
        color = TrafficLight.BLUE;
//        color = "RED"; //Not allowed
        Grades grades = Grades.A;
        grades = Grades.B;
        System.out.println(grades);

        grades = Grades.C;
        System.out.println(grades);

        Grades grade = Grades.valueOf("D");

        for (Grades value : Grades.values()) {
            System.out.println(value);
        }
    }
}
