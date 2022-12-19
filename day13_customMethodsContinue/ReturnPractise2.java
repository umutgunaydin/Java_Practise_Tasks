package day13_customMethodsContinue;

import java.util.Scanner;

public class ReturnPractise2 {
    public static void main(String[] args) {

        System.out.println("enter number:");
        int number = new Scanner(System.in).nextInt();

        if (number < 1 || number > 7) {
            System.err.println("invalid number");
            return;
        }

        System.out.println((number==1)?"monday":(number==2)?"tuesday":(number==3)?"wednesday"
                :(number==4)?"thursday":(number==5)?"friday" :(number==6)?"saturday":"sunday");

    }
}
