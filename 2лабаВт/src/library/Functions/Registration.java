package library.Functions;

import library.Data.AddToFile;
import library.Data.GetData;
import library.Entity.User;

import java.util.ArrayList;

public class Registration {
    /**
     * Registr new user and add login and password in file with UserData
     */
    public static void reg() {
        boolean correct = false;
        while (!correct) {
            System.out.println("Введите логин");
            String login = InputFunc.inpText();
            System.out.println("Введите пароль");
            String password = new String(InputFunc.inpText());
            String text = login + "~" + password.hashCode() + "~false";
            String name = "logins.txt";
            ArrayList<User> Users = GetData.GetUsers(name);
            correct = true;
            for (User users : Users) {
                if (users.getLogin().equals(login)) {
                    correct = false;
                    System.out.println("Данный логин уже существует");
                }
            }
            if (correct)
                AddToFile.add(name, text);
        }
    }
}
