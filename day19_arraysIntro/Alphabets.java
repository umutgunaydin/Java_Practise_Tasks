package day19_arraysIntro;

import java.util.Arrays;

public class Alphabets {
    public static void main(String[] args) {

        char[] alphabet=new char[26];

        for (int i = 0,j='A'; i < alphabet.length; i++,j++) {
            alphabet[i]= (char) j;
        }

        System.out.println(Arrays.toString(alphabet));

        System.out.println("-----------------------");

        for (int i = 0,j='Z'; i < alphabet.length; i++,j--) {
            alphabet[i]= (char) j;
        }

        System.out.println(Arrays.toString(alphabet));
    }
}
