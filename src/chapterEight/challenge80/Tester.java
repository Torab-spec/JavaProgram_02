package chapterEight.challenge80;

public class Tester {
    public static void main(String[] args) {
        Book book = new Book();
        book.checkout();
        book.returnItem();

        Magazine magazine = new Magazine();
        magazine.checkout();
        magazine.returnItem();

        DVD dvd = new DVD();
        dvd.checkout();
        dvd.returnItem();
    }
}
