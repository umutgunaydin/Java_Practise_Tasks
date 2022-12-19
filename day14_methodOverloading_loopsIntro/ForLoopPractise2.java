package day14_methodOverloading_loopsIntro;

import java.util.Scanner;

public class ForLoopPractise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int sum=0;
        for (int i = 0; i < 10; i++) {

            System.out.println("enter number:");
            sum+= input.nextInt();

        }
        System.out.println("sum = " + sum);
    }
}
