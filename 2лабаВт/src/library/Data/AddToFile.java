package library.Data;

import library.Entity.Book;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class AddToFile {
    /**
     * Add text to the end of file
     *
     * @param name - name of file
     * @param text - text to add in file
     */
    public static void add(String name, String text) {
        try (FileWriter writer = new FileWriter(name, true)) {
            writer.write(text + '\r' + '\n');
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Write in file ArrayList of Books
     *
     * @param name  - name of file
     * @param Books - ArrayList of Books
     */
    public static void rewriteBooks(String name, ArrayList<Book> Books) {

        try (FileWriter writer = new FileWriter(name, false)) {
            for (Book book : Books) {
                writer.write(book.getBookTitle() + "~" + book.getBookAuthor() + "~" + book.getBookType() + '\r' + '\n');
            }
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
