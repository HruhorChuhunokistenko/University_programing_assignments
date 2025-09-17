// Heorhii Mykytenko
// Assigment 3 - Objects
// COP3330

public class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean isAvailable;

    public Book() {
        this.title = "";
        this.author = "";
        this.isbn = "";
        this.isAvailable = true;
    }

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isAvailable = true;
    }

    public String getTitle() {return title;}
    public String getAuthor() {return author;}
    public String getIsbn() {return isbn;}
    public boolean isAvailable() {return isAvailable;}

    public String setTitle(String title) {this.title = title;}
    public String setAuthor(Strig author) {this.author = author;}
    public String setIsbn(String isbn) {this.isbn = isbn;}

    public void checkout() {this.isAvailable = false;}
    public void returnBook() {this.isAvailable = true;}
    public String getDescription() {return String.format }
}