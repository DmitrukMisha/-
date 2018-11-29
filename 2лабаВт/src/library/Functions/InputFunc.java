package library.Functions;

import java.util.Scanner;


public class InputFunc {
    /**
     * Scanner and check input text
     *
     * @return input text
     */
    public static String inpText() {
        String a;
        Scanner in = new Scanner(System.in);
        a = in.nextLine();
        return a;
    }

    /**
     * Scanner and check input int
     *
     * @return input unt
     */
    public static int inpInt() {
        System.out.println("Введите число");
        int a;
        Scanner in = new Scanner(System.in);
        while (!in.hasNextInt()) {
            in.next();
            System.out.println("Введены неверные значения");
        }
        a = in.nextInt();
        return a;
    }


}
