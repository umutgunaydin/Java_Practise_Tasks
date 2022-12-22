package day20_arraysUtilities_forEach;

import utilities.ArraysUtility;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {

        String str = "wooden spoon";

        char[] ch = str.replace(" ", "").toCharArray();

        System.out.println(Arrays.toString(ch));

        System.out.println("---------------------------------");

        String str2 = "today is great day to learn java";

        String[] words = str2.split(" ");

        System.out.println(Arrays.toString(words));

        System.out.println("-----------------------");

        String sentence="I love java";
        String[] reversed=ArraysUtility.reverse(sentence.split(" "));

        System.out.println(Arrays.toString(reversed));

        String reversedSentence="";

        for (int i = 0; i < reversed.length; i++) {
            reversedSentence+=reversed[i]+" ";
        }
        System.out.println("reversedSentence = " + reversedSentence);
    }
}
