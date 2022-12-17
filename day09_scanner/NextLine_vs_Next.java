package day09_scanner;

import java.util.Scanner;

public class NextLine_vs_Next {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);


        System.out.println("enter your age:");
        int age=input.nextInt();

        input.nextLine();//we need this to take enter!!!!!

        System.out.println("enter your name:");
        String name=input.nextLine();

        System.out.println("age = " + age);
        System.out.println("name = " + name);

        input.close();




    }



}
