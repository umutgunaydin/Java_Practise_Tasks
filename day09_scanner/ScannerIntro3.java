package day09_scanner;

import java.util.Scanner;

public class ScannerIntro3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("enter a character:");
        char ch=input.next().charAt(0);//for the first character
        System.out.println("you have entered: "+ch);

        System.out.println("would you like to continue?");
        String answer=input.next();//nextLine() reads entire line!!!!!!!!

        System.out.println("you have entered "+answer);

    }
}
