package day16_doWhileAndNestedLoops;

import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name;
        String password;
        int attempt = 3;

        do {

            System.out.println("enter username:");
            name = input.next();

            System.out.println("enter password:");
            password = input.next();

            attempt--;

            if (attempt == 0) {
                break;
            }

        } while (!(name.equals("Sir") && password.equals("WoodenSpoon")));


    }
}
