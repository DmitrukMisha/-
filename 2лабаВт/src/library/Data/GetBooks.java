package library.Data;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import library.Entity.Book;

public class GetBooks {
    /**
     * Get books from file into ArrayList of Books
     *
     * @param name - name of file
     * @return ArrayList of books
     */
    public static ArrayList<Book> GetListOfBooks(String name) {
        ArrayList<Book> Books = new ArrayList<Book>();
        try {
            FileInputStream fstream = new FileInputStream(name);
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

            String strLine;

            while ((strLine = br.readLine()) != null) {
                String[] values = new String[3];
                values = strLine.split("~");
                Books.add(new Book(values[0], values[1], values[2]));
            }

        } catch (IOException e) {
            System.out.println("Ошибка");
        }
        return Books;
    }
}
