package day15_branchingStatements;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("enter first number:");
        double number1= input.nextInt();

        System.out.println("enter second number:");
        double number2= input.nextInt();

        System.out.println("enter math operator:");
        char operator=input.next().charAt(0);

        boolean validOperator=operator=='-'||operator=='+'||operator=='/'||operator=='*';

        while (!validOperator){
            System.err.println("invalid entry. please enter valid operator:");
            operator=input.next().charAt(0);
        }

        double result=0;

        if (operator=='/'){
            result=number1 /number2;
        }else if (operator=='*'){
            result=number1* number2;
        }else if (operator=='-'){
            result=number1- number2;
        }else {
            result=number1 +number2;
        }

        System.out.println("result = " + result);



    }
}
