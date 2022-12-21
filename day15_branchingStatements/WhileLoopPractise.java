package day15_branchingStatements;

import java.util.Scanner;

public class WhileLoopPractise {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter age:");
        int age = input.nextInt();

        while (!(age >= 1 && age <= 150)) {
            System.out.println("invalid entry. Please reenter age:");
            age = input.nextInt();
        }

        if (age >= 21) {
            System.out.println("eligible");
        } else {
            System.out.println("not eligible");
        }
        input.close();

    }
}
