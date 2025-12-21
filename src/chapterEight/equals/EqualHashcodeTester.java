package chapterEight.equals;

public class EqualHashcodeTester {
    public static void main(String[] args) {
        Person person1 = new Person("Torab", 12, "09");
        Person person2 = new Person("Torab", 12, "09");
//        Person  = new Person("Bina", 9, "10");

        if (person1.equals(person2)) {
            System.out.println("Equals");
        } else {
            System.out.println("not Equals");
        }

    }


}
