package day09_scanner;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("enter number:");
        int number=input.nextInt();

        if (number%2==0){
            System.out.println("even");
        }else {
            System.out.println("odd");
        }
        input.close();
    }
}
