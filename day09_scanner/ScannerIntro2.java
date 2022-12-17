package day09_scanner;

import java.util.Scanner;

public class ScannerIntro2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("enter decimal number:");
        double number=input.nextDouble();
        System.out.println("enter second decimal: ");
        float number2=input.nextFloat();
        System.out.println("enter true or false:");
        boolean r=input.nextBoolean();

        System.out.println("number = " + number);
        System.out.println("number2 = " + number2);
        System.out.println("r = " + r);

        input.close();
    }

}
