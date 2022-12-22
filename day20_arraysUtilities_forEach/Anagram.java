package day20_arraysUtilities_forEach;

import java.util.Arrays;

public class Anagram {// built out by same letters
    public static void main(String[] args) {

        String str1="heart";
        String str2="earth";

        String[] strings1=str1.split("");// str1.toCharArray() has same function
        String[] strings2=str2.split("");

        Arrays.sort(strings1);
        Arrays.sort(strings2);

        if (Arrays.equals(strings1,strings2)){
            System.out.println("arrays are anagram!");
        }

    }
}
