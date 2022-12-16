package day06_ifStatements;

public class MaximumNumber {
    public static void main(String[] args) {

        int num1=15;
        int num2=30;

        if (num2<num1){
            System.out.println(num1+ " is bigger than "+num2);
        }
        if (num2>num1){
            System.out.println(num2+" is bigger than "+num1);
        }
        if (num2==num1){
            System.out.println("Given numbers are equal.");
        }
    }
}
/*
1. Create a class named MaximumNumber.java
2. Declare the following variables: 1. num1 2. num2
3. Write a program that can print the maximum number between the two numbers above,
if both are equal then print Equal
Ex:
num1 = 10 num2 = 20
output: 20 is the maximum number
 */