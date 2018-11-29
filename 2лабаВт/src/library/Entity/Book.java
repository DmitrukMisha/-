package library.Entity;

public class Book {
    private String BookTitle;
    private String BookAuthor;
    private String BookType;


    public Book() {
    }

    public Book(String BoolTitle, String BookAuthor, String BookType) {
        this.BookTitle = BoolTitle;
        this.BookAuthor = BookAuthor;
        this.BookType = BookType;
    }

    public void setBookTitle(String BookTitle) {
        this.BookTitle = BookTitle;
    }

    public void setBookAuthor(String BookAuthor) {
        this.BookAuthor = BookAuthor;
    }

    public void setBookType(String BookType) {
        this.BookType = BookType;
    }

    public String getBookTitle() { return BookTitle; }

    public String getBookAuthor() {
        return BookAuthor;
    }

    public String getBookType() {
        return BookType;
    }


}
