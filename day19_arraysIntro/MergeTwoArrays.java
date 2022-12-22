package day19_arraysIntro;

import utilities.ArraysUtility;

import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {

        int[] numbers1 = {1, 2, 3, 4};
        int[] numbers2 = {6, 7};

        int[] mergedNumbers = new int[numbers1.length + numbers2.length];

        for (int i = 0; i < mergedNumbers.length; i++) {

            if (i + 1 <= numbers1.length) {
                mergedNumbers[i] = numbers1[i];
            }else {
                mergedNumbers[i]=numbers2[i-numbers1.length];
            }
        }

        System.out.println(Arrays.toString(mergedNumbers));

        System.out.println("---------------");

        int[] a1={1,7,2,5,1};
        int[] a2={2,3,1,3};

        int[] a3=ArraysUtility.merge(a1,a2);

        System.out.println(Arrays.toString(a3));

    }
}
