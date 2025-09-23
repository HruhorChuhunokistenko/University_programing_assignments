import java.util.ArrayList;
import java.util.Arrays;

// Heorhii Mykytenko
// Assigment 3 - Objects
// COP3330

public class KnightLibrary {
    public static void main(String[] args) {
        
        Book b0001 = new Book();
        b0001.setTitle("Kobzar");
        b0001.setAuthor("Taras Shevchenko");
        b0001.setIsbn("456-65-2021-6548");
        Book b0002 = new Book("Voroshilovgrad","Serhiy Zhadan","456-63-2010-7458");
        Book b0003 = new Book("Cassandra","Lesya Ukrainka","456-64-2005-9865");

        // Puts all books in mutable array
        ArrayList<Book> library = new ArrayList<>(Arrays.asList(b0001, b0002, b0003));

        System.out.println("All books before checkout:");
        // Prints information for every ellement of array
        for (Book book : library) {
            System.out.println(book.getDescription());
        }

        // Manipulations with books
        b0001.checkout();
        b0002.checkout();
        b0002.returnBook();

        System.out.println("All books after checkout:");
        for (Book book : library) {
            System.out.println(book.getDescription());
        }
    }
}