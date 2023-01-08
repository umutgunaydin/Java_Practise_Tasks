package day38_exceptionHandlingContinue;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowKeyword {
    public static void main(String[] args) {

        System.out.println("enter your age:");
        int age=new Scanner(System.in).nextInt();

        if (age<0||age>150){
            throw new InputMismatchException("Age cannot be negative or greater than 150");
            // we use throw to create exception not for handling
        }

    }
}
