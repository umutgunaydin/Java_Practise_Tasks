package day19_arraysIntro;

public class MaxMinArray {
    public static void main(String[] args) {

        int[] numbers={3,5,2,6,9,22,557,33};

        int max=numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]>max){
                max=numbers[i];
            }
        }

        System.out.println("max = " + max);

        System.out.println("---------------------");

        int min=numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]<min){
                min=numbers[i];
            }
        }

        System.out.println("min = " + min);

    }
}
