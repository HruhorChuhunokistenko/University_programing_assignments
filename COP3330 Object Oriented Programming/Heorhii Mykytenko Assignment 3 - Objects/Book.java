// Heorhii Mykytenko
// Assigment 3 - Objects
// COP3330

public class Book {
    // Instanece Virables
    private String title;
    private String author;
    private String isbn;
    private boolean isAvailable;

    // Emty constractor  
    public Book() {
        this.title = "";
        this.author = "";
        this.isbn = "";
        this.isAvailable = true;
    }

    // Constructor which receives inputs from user
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isAvailable = true;
    }

    // Accessor methods
    public String getTitle() {return title;}
    public String getAuthor() {return author;}
    public String getIsbn() {return isbn;}
    public boolean isAvailable() {return isAvailable;}

    // Mutator methods
    public void setTitle(String title) {this.title = title;}
    public void setAuthor(String author) {this.author = author;}
    public void setIsbn(String isbn) {this.isbn = isbn;}

    // Utility methods
    public void checkout() {this.isAvailable = false;}
    public void returnBook() {this.isAvailable = true;}
    public String getDescription() {
        return String.format("Title: %s; Author %s; ISBN: %s; Availability: %s",
            title, author, isbn, isAvailable ? "Yes" : "No");
        }
}