package day16_doWhileAndNestedLoops;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double firstNumber;
        double secondNumber;
        char operator;
        double result;

        while (true) {

            System.out.println("Enter your first number:");
            firstNumber = input.nextDouble();

            System.out.println("Enter the math operator up to your operation: /,*,-,+");
            operator = input.next().charAt(0);

            while (operator != '/' && operator != '*' && operator != '-' && operator != '+') {
                System.out.println("Invalid operator. Please reenter the operator:");
                operator = input.next().charAt(0);
            }

            System.out.println("Enter your second number:");
            secondNumber = input.nextDouble();

            if (operator == '/') {
                result = firstNumber / secondNumber;
            }else if (operator == '*') {
                result = firstNumber * secondNumber;
            }else if (operator == '-') {
                result = firstNumber - secondNumber;
            }else  {
                result = firstNumber + secondNumber;
            }

            System.out.println("result = " + result);

            System.out.println("Would you like to continue? Yes/No");
            String answer=input.next().toLowerCase();

            while (!(answer.equals("yes")||answer.equals("no"))){
                System.out.println("Invalid answer. Please reanswer the question:");
                answer=input.next().toLowerCase();
            }

            if (answer.equals("no")){
                break;
            }


        }


    }
}
