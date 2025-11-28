public class Challenge51 {
    // ch51 -> Book class

    public static void main(String[] args) {


        Book libraryBooks = new Book();
        libraryBooks.title = "Power";
        String title = libraryBooks.title;
        libraryBooks.author = "Robert Green";
        String author = libraryBooks.author;
        libraryBooks.price = 384;
        int price = libraryBooks.price;

        System.out.println(libraryBooks.borrowBook(title, author));
        System.out.println(libraryBooks.returnBook(title, author));


    }
}

class Book {
    String title;
    String author;
    int price;
    static int totalBooks;

    public String borrowBook(String title, String author) {

        return "The Book name " + title + " which is written by " + author + " is borrowed";

    }

    public String returnBook(String title, String author) {

        return "The Book name " + title + " which is written by " + author + " is returned";
    }

    public static int getTotalBooks(int totalBook) {
        totalBooks += totalBook;
        return totalBooks;
    }


}


