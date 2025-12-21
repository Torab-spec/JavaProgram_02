package chapterEight.challenge81;

public class PersonTester {
    public static void main(String[] args) {
        Person p1 = new Person("Rina", 22, 1);
        Person p2 = new Person("Rina", 22, 1);

        if (p2.equals(p2)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not equal");
        }
    }
}
