package library.Interface;

import library.Functions.AdminFunc;
import library.Functions.InputFunc;
import library.Functions.UserFunc;

public class AdminMenu {


    public static void ShowAdminMenu() {
        boolean notExit = true;
        while (notExit) {
            System.out.println("1. Просмотр списка книг");
            System.out.println("2. Добавление книги в каталог");
            System.out.println("3. Удаление книги из каталога");
            System.out.println("4. Изменение данных о книге");
            System.out.println("0. Выйти");
            int ur = InputFunc.inpInt();
            switch (ur) {
                case 1:
                    UserFunc.ShowBooks();
                    break;
                case 2:
                    AdminFunc.AddBook();
                    break;
                case 3:
                    AdminFunc.DelBook();
                    break;
                case 4:
                    AdminFunc.ChangeBookInfo();
                    break;
                case 0:
                    notExit = false;
                    break;
            } // switch
        } // while

    }


}
