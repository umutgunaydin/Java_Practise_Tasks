package day37_exceptions_exceptionHandlings;

import day36_OOP_PolymorphismContinue.Pizza;

import java.io.FileInputStream;

public class ExceptionsIntro {
    public static void main(String[] args) {

        // unchecked exceptions, in other words this is runtime exception

        String str="java";

       // char ch=str.charAt(250); // out of bound exception

      //  System.out.println(ch);

       // Pizza pizza=null;// null pointer unchecked exception
       // pizza.calcCost();

        System.out.println("-------------------------------");

        int score=100;

        if (score>59){  // this is a bug not exception!!!!!!!
            System.out.println("D");
        } else if (score > 70) {
            System.out.println("C");
        }

        System.out.println("---------------------------");

       // FileInputStream file=new FileInputStream(""); // checked exception, compile time exception
// there will be alert for this type


    }
}
