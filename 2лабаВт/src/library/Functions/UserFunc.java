package library.Functions;

import library.Data.GetBooks;
import library.Entity.Book;

import java.util.ArrayList;


public class UserFunc {
    /**
     * Show ArrayList of Books
     */
    public static void ShowBooks() {
        ArrayList<Book> Books = GetBooks.GetListOfBooks("books.txt");
        for (Book book : Books) {
            System.out.println(Books.indexOf(book) + 1 + ". " + book.getBookTitle() + " | " + book.getBookAuthor() + " | " + book.getBookType());
        }
    }

    /**
     * Show Books from ArrayList of Books which startsWish bookTitle from search
     */
    public static void Search() {
        ArrayList<Book> Books = GetBooks.GetListOfBooks("books.txt");
        System.out.println("Введите название искомой книги");
        String booktitle = InputFunc.inpText();
        int i = 1;
        for (Book book : Books) {
            if (book.getBookTitle().toLowerCase().startsWith(booktitle.toLowerCase()))
                System.out.println(i + ". " + book.getBookTitle() + " | " + book.getBookAuthor() + " | " + book.getBookType());
        }

    }


}
