package day19_arraysIntro;

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {

        int score1 = 34;
        int score2 = 95;
        int score3 = 45;
        int score4 = 78;
        int score5 = 76;

        System.out.println("---------------------");

        int[] scores = new int[5];

        scores[0]=85;
        scores[2]=78;

        System.out.println(Arrays.toString(scores));

        System.out.println(scores[2]);

        System.out.println("---------------");

        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }

        System.out.println("-------------------");

        System.out.println(scores[scores.length-1]);
        
    }
}
