package day14_methodOverloading_loopsIntro;

import java.util.Scanner;

public class MaxMinNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int max = -2147483648; //min int number
        int min = 2147483647;  // max int number

        for (int i = 0; i < 5; i++) {

            System.out.println("enter number:");
            int number = input.nextInt();

            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }

        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);

    }
}
