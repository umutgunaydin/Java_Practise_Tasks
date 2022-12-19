package day13_customMethodsContinue;

import java.util.Scanner;

public class ReturnStatementPractise {
    public static void main(String[] args) {

        System.out.println("enter grade:");
        char grade=new Scanner(System.in).next().charAt(0);

        boolean isValid=grade=='A'||grade=='B'||grade=='C'||grade=='D'||grade=='F';

        if (!isValid){
            System.err.println("Invalid grade");
            return;
        }

        System.out.println((grade=='A')?"excellent":(grade=='B')?"great":(grade=='C')?"good"
                :(grade=='D')?"passed":"failed");

    }
}
