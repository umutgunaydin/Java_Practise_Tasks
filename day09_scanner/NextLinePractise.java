package day09_scanner;

import java.util.Scanner;

public class NextLinePractise {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("enter your full name:");
        String fullName=input.nextLine();// if there is nextLine after nextLine no need to use extra to take enter

        System.out.println("enter school name:");
        String schoolName=input.nextLine();

        System.out.println("enter gender:");
        String gender=input.next();

        System.out.println("enter age:");
        int age=input.nextInt();

       input.nextLine();// after any others we have to use empty nextLine before exact nextLine!!!!

        System.out.println("enter street name:");
        String street=input.nextLine();

        

    }
}
