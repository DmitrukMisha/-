package library.Data;

import library.Entity.User;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class GetData {
    /**
     * Get Users from file into ArrayList of Users
     *
     * @param name - name of file
     * @return ArrayList of Users
     */
    public static ArrayList<User> GetUsers(String name) {

        ArrayList<User> Users = new ArrayList<User>();

        try {
            FileInputStream fstream = new FileInputStream(name);
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

            String strLine;

            while ((strLine = br.readLine()) != null) {
                String[] values = new String[3];
                values = strLine.split("~");
                Users.add(new User(values[0], values[1], Boolean.valueOf(values[2])));
            }
        } catch (IOException e) {
            System.out.println("Ошибка");
        }

        return Users;
    }

    /**
     * Check entered login and password
     *
     * @param name  name of file
     * @param pass  entered password
     * @param login entered login
     * @return User from ArrayList of Users or null
     */
    public static User UserIsset(String name, int pass, String login) {

        ArrayList<User> Users = GetUsers(name);

        String password = String.valueOf(pass);

        for (User user : Users) {
            if (password.equals(user.getPassword()) && login.equals(user.getLogin()))
                return user;
        }


        return null;
    }
}
