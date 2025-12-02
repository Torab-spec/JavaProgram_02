public class Challenge51 {
    // ch51 -> Book class

    public static void main(String[] args) {

/*
        Book libraryBooks = new Book();
        libraryBooks.title = "Power";
        String title = libraryBooks.title;
        libraryBooks.author = "Robert Green";
        String author = libraryBooks.author;
        libraryBooks.price = 384;
        int price = libraryBooks.price;

        System.out.println(libraryBooks.borrowBook(title, author));
        System.out.println(libraryBooks.returnBook(title, author));
*/

        Book1 java = new Book1("1", "Java", "Prasant");
        Book1 react = new Book1("2");
        Book1 nodeJs = new Book1("3", "NodeJs", "Golu");


        System.out.println("Total number of book is " + Book1.getTotalBook());
        java.borrowedBook();
        java.borrowedBook();
        java.returnBook();
        java.returnBook();

        System.out.println(" ");

        react.borrowedBook();
        react.returnBook();

        System.out.println(" ");

        nodeJs.returnBook();
        nodeJs.borrowedBook();


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


class Book1 {
    static int totalBook;
    String author;
    String title;
    String isbn;
    boolean isBorrowed;

    static {
        totalBook = 0;
    }

    {
        totalBook++; // When the object is created the total number of book will be increased; | As much as object is created  the increment of totalBook will be increase
    }

    Book1(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;

    }

    Book1(String isbn) {
        this(isbn, "Unknown", "Unknown"); // Chaining of constructor | this constructor call the above constructor
    }

    static int getTotalBook() {
        return totalBook;
    }

    void borrowedBook() {
        if (isBorrowed) {
            System.out.println("The " + this.title + " book is borrowed");
        } else {
            this.isBorrowed = true;
            System.out.println("Enjoy the " + this.title + " book");
        }
    }

    void returnBook() {
        if (isBorrowed) {
            this.isBorrowed = false;

            System.out.println(this.title + " Book is returning , Hope you enjoyed the " + this.title + " book , Please leave a review");
        } else {
            System.out.println("The  " + this.title + " book had been return , this book in now  available");
        }

    }

}

