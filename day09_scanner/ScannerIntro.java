package day09_scanner;

import java.util.Scanner;
//import java.util.*;

public class ScannerIntro {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("please enter your first number:");
        byte num1 = input.nextByte();

        System.out.println("enter your second number: ");
        int num2=input.nextByte();

        System.out.println("enter third number: ");
        short num3=input.nextShort();

        System.out.println("first you entered: "+num1);
        System.out.println("second you entered: "+num2);
        System.out.println("third number: "+num3);

        input.close();//when we finish using we should close it


    }
}
