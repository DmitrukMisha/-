package library.Interface;

import library.Data.GetData;
import library.Entity.User;
import library.Functions.InputFunc;

public class Enter {

    public static void Enter(String name) {
        boolean correct = false;
        while (!correct) {
            System.out.println("Введите логин");
            String login = InputFunc.inpText();
            System.out.println("Введите пароль");
            String password = new String(InputFunc.inpText());
            User user = GetData.UserIsset(name, password.hashCode(), login);
            if (user == null) {
                System.out.println("Неправильный логин/пароль");
            } else {
                correct = true;
                if (user.getRole()) {
                    AdminMenu.ShowAdminMenu();
                } else UserMenu.ShowUserMenu();

            }
        }

    }
}
