package day16_doWhileAndNestedLoops;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("enter number:");
            int number = input.nextInt();

            if (number % 2 == 0) {
                System.out.println("even number.");
            } else {
                System.out.println("odd number.");
            }

            System.out.println("would you like to enter another number? yes/no");
            String answer = input.next().toLowerCase();

            while (!(answer.equals("no") || answer.equals("yes"))) {
                System.err.println("invalid answer. please reenter");
                answer = input.next().toLowerCase();
            }

            if (answer.equals("no")) {
                break;
            }
        }

        input.close();

    }
}
