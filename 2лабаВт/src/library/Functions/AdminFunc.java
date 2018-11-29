package library.Functions;

import library.Data.AddToFile;
import library.Data.GetBooks;
import library.Entity.Book;

import java.util.ArrayList;

public class AdminFunc {
    /**
     * Add book in ArrayList of Books and in file with books
     */
    public static void AddBook() {
        System.out.println("Введите название книги");
        String bookname = InputFunc.inpText();
        System.out.println("Введите автора книги");
        String bookauthor = InputFunc.inpText();
        System.out.println("Введите тип книги");
        System.out.println("1.Бумажный вариант");
        System.out.println("2.Электронный вариант");
        String booktype = "";
        int ur = InputFunc.inpInt();
        switch (ur) {
            case 1:
                booktype = "Бумажный вариант";
                break;
            case 2:
                booktype = "Электронный вариант";
                break;
        }
        String text = bookname + "~" + bookauthor + "~" + booktype;
        String name = "books.txt";
        AddToFile.add(name, text);

    }

    /**
     * Delete book from ArrayList of Books and from file with books
     */
    public static void DelBook() {
        UserFunc.ShowBooks();
        System.out.println("\n Выберите книгу для удаления ");
        int index = InputFunc.inpInt();
        ArrayList<Book> Books = GetBooks.GetListOfBooks("books.txt");
        Books.remove(index - 1);
        AddToFile.rewriteBooks("books.txt", Books);
    }

    /**
     * Change book Info in ArrayList of Books and in file with books
     */
    public static void ChangeBookInfo() {

        UserFunc.ShowBooks();

        Book book = new Book();

        System.out.println("\n Выберите индекс изменяемой книги ");
        int index = InputFunc.inpInt();
        System.out.println("\n Введите новые данные о книге ");
        System.out.println("\n Введите название книги ");
        book.setBookTitle(InputFunc.inpText());
        System.out.println("\n Введите автора книги ");
        book.setBookAuthor(InputFunc.inpText());
        System.out.println("\n Введите тип книги ");
        book.setBookType(InputFunc.inpText());
        ArrayList<Book> Books = GetBooks.GetListOfBooks("books.txt");
        Books.set(index - 1, book);

        AddToFile.rewriteBooks("books.txt", Books);
    }


}
