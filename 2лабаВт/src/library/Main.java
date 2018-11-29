package library;

import library.Functions.Registration;
import library.Interface.Enter;
import library.Functions.InputFunc;


public class Main {

    public static void main(String[] args) {

        boolean notExit = true;
        while (notExit) {

            System.out.println("1. Зарегистрироваться");
            System.out.println("2. Войти");
            System.out.println("0. Выйти");
            int ur = InputFunc.inpInt();
            switch (ur) {
                case 1:
                    Registration.reg();
                    break;
                case 2:
                    Enter.Enter("logins.txt");
                    break;
                case 0:
                    notExit = false;
                    break;
            } // switch
        } // while


    }
}
