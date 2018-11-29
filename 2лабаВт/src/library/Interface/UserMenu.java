package library.Interface;

import library.Functions.InputFunc;
import library.Functions.UserFunc;

public class UserMenu {

    public static void ShowUserMenu() {
        boolean notExit = true;
        while (notExit) {

            System.out.println("1. Просмотр списка книг");
            System.out.println("2. Поиск книги");
            System.out.println("0. Выйти");
            int ur = InputFunc.inpInt();
            switch (ur) {
                case 1:
                    UserFunc.ShowBooks();
                    break;
                case 2:
                    UserFunc.Search();
                    break;
                case 0:
                    notExit = false;
                    break;
            } // switch
        } // while

    }

}
