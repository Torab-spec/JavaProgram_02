package chapterNine.overloading;

public class Overloading {
    Overloading() {
        System.out.println("Default Constructor called");
    }

    Overloading(String pop) {
        System.out.println(pop);
    }


    public int add(int a, int b) {
        return a + b;
    }

    public String add(String a, String b) {
        return a + b;
    }

    public int add(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    public static void main(String[] args) {
        System.out.println(" ");
        Overloading overloading = new Overloading();
        Overloading overloading2 = new Overloading("Hey");

        System.out.println(overloading.add(2, 4));
        System.out.println(overloading.add("Tor", "ab"));
        System.out.println(overloading.add(2, 4, 6, 9));

    }
}
