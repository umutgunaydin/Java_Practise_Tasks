package day19_arraysIntro;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class AverageNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("how many number do you want to enter?");
        int numberOfEnters = input.nextInt();

        int[] numbers=new int[numberOfEnters];
        int sum=0;

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("enter the "+(i+1)+". number:");
            numbers[i]=input.nextInt();

            sum+=numbers[i];
        }

        double average=(double)sum/numberOfEnters;

        DecimalFormat df=new DecimalFormat("0.00");

        System.out.println(Arrays.toString(numbers));
        System.out.println("sum = " + sum);
        System.out.println("average = " + df.format(average));


    }

}
