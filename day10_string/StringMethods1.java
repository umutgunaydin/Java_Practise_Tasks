package day10_string;

import java.util.Scanner;

public class StringMethods1 {
    public static void main(String[] args) {

        String str = "World";
        // index:   01234    !!minimum is zero!!max is length-1!!!

        char firstChar = str.charAt(0);
        char secondChar = str.charAt(1);

        System.out.println("firstChar = " + firstChar);
        System.out.println("secondChar = " + secondChar);

        System.out.println("----------------------------------------");

        String sentence = "java programming language";
        int length = sentence.length();

        System.out.println("length = " + length);

        int lastIndex = length - 1;
        System.out.println("lastIndex = " + lastIndex);

        System.out.println("-----------------------------------------");

        String s1 = "wooden spoon";
        char f = s1.charAt(0);

        int lastIndexNumber = s1.length() - 1;

        char l = s1.charAt(lastIndexNumber);

        System.out.println("first = " + f);
        System.out.println("last = " + l);

        System.out.println("---------------------------------------");

        String name1 = "umut";
        String name2 = new String("umut");

        System.out.println(name1 == name2);//false

        System.out.println(name1.equals(name2));//true

        System.out.println("------------------------------------");

        String r1 = "java";
        String r2 = "java";
        String r3 = new String("java");

        System.out.println(r1 == r2);//true
        System.out.println(r1 == r3);//false

        System.out.println(r2.equals(r3));//true

        System.out.println("----------------------------------------");

        Scanner input = new Scanner(System.in);

        System.out.println("age:");
        int age = input.nextInt();

        System.out.println("us citizen? yes/no");
        String answer = input.next();

        if (age >= 21 && answer.equals("yes")) {//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
            System.out.println("eligible to vote");
        } else {
            System.out.println("not eligible to vote");
        }

        input.close();

    }
}
